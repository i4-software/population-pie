package uk.co.i4software.poppie.census;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (c) Copyright i4 Software Ltd. All Rights Reserved.
 *
 * @author David Barton
 * @since May 2015
 */
@EqualsAndHashCode(of={"locationName"})
public class Location implements Serializable {

    private static final long serialVersionUID = 1947698132369542867L;

    @Getter private final String locationName;
    @Getter private final List<Fact> facts;
    @Getter private final Map<FactName, Fact> factMap;

    public Location(String locationName) {
        this(locationName, new ArrayList<Fact>());
    }

    public Location(String locationName, List<Fact> facts) {
        this.locationName = locationName;
        this.facts = facts;

        this.factMap = new HashMap<FactName, Fact>();
        indexFacts();
    }

    private void indexFacts() {
        for (Fact fact : facts)
            factMap.put(fact.getFactName(), fact);

    }

    public String toString() {
        return locationName;
    }

    public List<Fact> factsFor(FactName... factNames) {

        List<Fact> facts = new ArrayList<Fact>();

        for (FactName factName : factNames)
            if (hasFact(factName))
                facts.add(factMap.get(factName));

        return facts;
    }

    private boolean hasFact(FactName factName) {
        return factMap.containsKey(factName);
    }

    public Long factValueOf(FactName factName) {
        return hasFact(factName) ? factMap.get(factName).getFactValue() : null;
    }
}