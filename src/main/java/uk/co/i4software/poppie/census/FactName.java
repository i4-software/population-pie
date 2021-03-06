package uk.co.i4software.poppie.census;

import lombok.Getter;

/**
 * (c) Copyright i4 Software Ltd. All Rights Reserved.
 *
 * @author David Barton
 * @since June 2015
 */
public enum FactName {

    TOTAL_MALES(12, "Total Males", 2903),
    TOTAL_FEMALES(13, "Total Females", 2767),

    AGE_0_4(14, "Age 0-4", 141),
    AGE_5_9(15, "Age 5-9", 104),
    AGE_10_15(16, "Age 10-15", 102),
    AGE_16_24(17, "Age 16-24", 1181),
    AGE_25_44(18, "Age 25-44", 2018),
    AGE_45_64(19, "Age 45-64", 1148),
    AGE_65_74(20, "Age 65-75", 381),
    AGE_75_AND_OVER(21, "75 and over", 595),

    IN_HOUSEHOLDS(22, "In households", 5480),
    IN_COMMUNAL_ESTABLISHMENTS(23, "In communal establishments", 190),
    FULL_TIME_STUDENTS(24, "Full time students", 903),

    WHITE(25, "White", 4976),
    BLACK_AND_MINORITY_ETHNIC(30, "Black or Minority Ethnic", 694),

    WHITE_BRITISH(26, "White British", 4238),
    WHITE_IRISH(27, "White Irish", 78),
    WHITE_GYPSY_OR_IRISH_TRAVELLER(28, "White Gypsy or Irish Traveller", 0),
    OTHER_WHITE(29, "Other White", 660),

    WHITE_AND_BLACK_CARIBBEAN(31, "White and Black Caribbean", 19),
    WHITE_AND_BLACK_AFRICAN(32, "White and Black African", 17),
    WHITE_AND_ASIAN(33, "White and Asian", 34),
    OTHER_MIXED(34, "Other Mixed", 49),

    INDIAN(35, "Indian", 83),
    PAKISTANI(36, "Pakistani", 3),
    BANGLADESHI(37, "Bangladeshi", 10),
    CHINESE(38, "Chinese", 196),
    OTHER_ASIAN(39, "Other Asian", 136),

    AFRICAN(40, "African", 22),
    CARIBBEAN(41, "Caribbean", 32),
    OTHER_BLACK(42, "Other Black", 8),

    ARAB(43, "Arab", 40),
    OTHER(44, "Other", 45),

    UNITED_KINGDOM(45, "United Kingdom", 4199),
    REPUBLIC_OF_IRELAND(46, "Republic Of Ireland", 48),
    EU_COUNTRIES(47, "EU Countries", 313),
    EU_ACCESSION_COUNTRIES(48, "EU Accession Countries", 207),
    OTHER_COUNTRIES(49, "Other Countries", 903),

    CHRISTIAN(50, "Christian", 2634),
    BUDDHIST(51, "Buddhist", 96),
    HINDU(52, "Hindu", 39),
    JEWISH(53, "Jewish", 14),
    MUSLIM(54, "Muslim", 113),
    SIKH(55, "Sikh", 3),
    OTHER_RELIGIONS(56, "Other religions", 62),
    NO_RELIGION(57, "No religion", 2181),
    RELIGION_NOT_STATED(58, "Religion not stated", 528),

    MAIN_LANGUAGE_ENGLISH(60, "Main language English", 4797),
    MAIN_LANGUAGE_NOT_ENGLISH(61, "Main language not English", 784),

    BORN_IN_UK(63, "Born in UK", 4199),
    LESS_THAN_TWO_YEARS(64, "< 2 years", 414),
    TWO_TO_FIVE_YEARS(65, "2-5 years", 350),
    FIVE_TO_TEN_YEARS(66, "5-10 years", 235),
    MORE_THAN_TEN_YEARS(67, "> 10 years", 472),

    VERY_GOOD_HEALTH(72, "Very good health", 2830),
    GOOD_HEALTH(73, "Good health", 1834),
    FAIR_HEALTH(74, "Fair health", 714),
    BAD_HEALTH(75, "Bad health", 231),
    VERY_BAD_HEALTH(76, "Very bad health", 61),

    ONE_NINETEEN(78, "1 to 19", 304),
    TWENTY_FORTYNINE(79, "20 to 49", 48),
    FIFTY_PLUS(80, "50+", 60),

    ECONOMICALLY_ACTIVE(82, "Economically Active", 3167),
    ECONOMICALLY_INACTIVE(88, "Economically Inactive", 1561),

    FULL_TIME_EMPLOYEES(83, "Full time employee", 1869),
    PART_TIME_EMPLOYEES(84, "Part time employee", 414),
    SELF_EMPLOYED(85, "Self employed", 490),
    UNEMPLOYED(86, "Unemployed", 159),
    FULL_TIME_STUDENT(87, "Full time student", 235),

    RETIRED(89, "Retired", 436),
    STUDENT(90, "Student", 716),
    LOOKING_AFTER_HOME(91, "Looking after home", 85),
    LONG_TERM_SICK(92, "Sick/Disabled", 230),
    ECONOMICALLY_INACTIVE_OTHER(93, "Other", 94),

    NO_QUALIFICATIONS(100, "None", 538),
    LEVEL_ONE(101, "Level 1", 313),
    LEVEL_TWO(102, "Level 2", 488),
    APPRENTICESHIP(103, "Apprenticeship", 60),
    LEVEL_THREE(104, "Level 3", 876),
    LEVEL_FOUR(105, "Level 4", 2725),
    QUALIFICATIONS_OTHER(106, "Other", 323),

    WORK_FROM_HOME(108, "Work from home", 277),
    LIGHT_RAIL(109, "Light rail", 5),
    TRAIN(110, "Train", 274),
    BUS(111, "Bus", 240),
    TAXI(112, "Taxi", 8),
    MOTORCYCLE(113, "Motorcycle", 15),
    DRIVING(114, "Driving", 723),
    PASSENGER(115, "Passenger", 60),
    BICYCLE(116, "Bicycle", 78),
    FOOT(117, "On foot", 1261),
    TRAVEL_TO_WORK_OTHER(118, "Other", 29),

    PT_FIFTEEN_OR_LESS(120, "15 or less", 283),
    PT_SIXTEEN_THIRTY(121, "16-30", 434),
    FT_THIRTYONE_FORTYEIGHT(122, "31-48", 1735),
    FT_FORTYNINE_PLUS(123, "49+", 518),

    HIGHER_MANAGERIAL(144, "Higher Managerial", 854),
    LOWER_MANAGERIAL(145, "Lower Managerial", 1161),
    INTERMEDIATE(146, "Intermediate", 360),
    SMALL_EMPLOYERS(147, "Small Employers", 385),
    LOWER_SUPERVISORY(148, "Lower Supervisory", 220),
    SEMI_ROUTINE(149, "Semi Routine", 369),
    ROUTINE(150, "Routine", 272),
    LONG_TERM_UNEMPLOYED(151, "Long Term Unemployed", 165),
    STUDENTS(152, "Student", 942 ),

    UNSHARED(154, "Unshared", 3584),
    SHARED(155, "Shared", 29),

    OCCUPIED(157, "Occupied", 3292),
    UNOCCUPIED(158, "Unoccupied", 408),

    DETACHED(159, "Detached", 50),
    SEMI_DETACHED(160, "Semi-detached", 101),
    TERRACED(161, "Terraced", 327),
    PURPOSE_BUILT_FLATS(162, "Purpose Built Flats", 1156),
    SHARED_HOUSE(163, "Shared House", 1733),
    COMMERCIAL_BUILDING(164, "Commercial Building", 325),
    CARAVAN(165, "Caravan", 8),

    OWNED_OUTRIGHT(167, "Owned Outright", 583),
    MORTGAGED(168, "Mortgaged", 385),
    PART_OWNED(169, "Part Owned", 28),
    LOCAL_AUTHORITY(170, "Local Authority", 79),
    SOCIAL_OTHER(171, "Social Other", 633),
    PRIVATE_LANDLORD(172, "Private Landlord", 1437),
    PRIVATE_OTHER(173, "Private Other", 94),
    RENT_FREE(174, "Living Rent Free", 53),

    NONE(177, "No Central Heating", 198),
    GAS(178, "Gas", 1948),
    ELECTRIC(179, "Electric", 1010),
    OIL(180, "Oil", 12),
    SOLID_FUEL(181, "Solid Fuel", 2),
    OTHER_CENTRAL_HEATING(182, "Other", 43),
    TWO_OR_MORE_TYPES(183, "Two or more types", 79),

    NO_CARS(184, "No cars in household", 1696),
    ONE_CAR(185, "One car in household", 1281),
    TWO_OR_MORE_CARS(186, "Two or more cars in household", 315),

    ONE_PERSON(189, "One Person", 1825),
    MARRIED_WITH_CHILDREN(190, "Married Children", 131),
    MARRIED_NO_CHILDREN(191, "Married No Children", 421),
    SAME_SEX_WITH_CHILDREN(192, "Same Sex Children", 0),
    SAME_SEX_NO_CHILDREN(193, "Same Sex No Children", 11),
    COHABITING_WITH_CHILDREN(194, "Cohabiting Children", 30),
    COHABITING_NO_CHILDREN(195, "Cohabiting No Children", 341),
    LONE_PARENT_WITH_CHILDREN(196, "Lone Parent Children", 73),
    LONE_PARENT_NO_CHILDREN(197, "Lone Parent No Children", 46),
    ALL_STUDENTS(198, "All Students", 168),
    MULTI_OTHER(199, "Multi Occupancy Other", 246);

    @Getter private final String displayName;
    @Getter private final int jsonColumnNumber;
    @Getter private final long testValue;

    FactName(int jsonColumnNumber, String displayName, long testValue) {
        this.displayName = displayName;
        this.jsonColumnNumber = jsonColumnNumber;
        this.testValue = testValue;
    }
}
