package com.example.logicbomb

// Caractéristiques d'une arme
data class WeaponData(
    val imageResId: Int,
    val name: String,
    val damage: Int,
    val magSize: Int,
    val capacityAmmo: Int,
    val rateOfFire: Int,
)

// Unité militaire
data class Unity(
    val imageResId: Int,
    val name: String,
)

// Pays
data class Country(
    val imageResId: Int,
    val name: String,
)

data class OperatorPersonalInfo(
    val realName: String,
    val birthDate: String,
    val age: Int,
    val height: String,
    val weight: String,
    val town: String,
    val country: Country,
    val unity: Unity
)

data class OperatorData(
    val imageResId: Int,
    val name: String,
    val description: String,
    val health: Int,
    val speed: Int,
    val primaryWeapon: List<WeaponData>,
    val secondaryWeapon: List<WeaponData>,
    val personalInfo: OperatorPersonalInfo
)
// Définition des armes
private val L85A2 = WeaponData(R.drawable.r6s_wpn_l85a2,"L85A2", 47, 30, 181, 670)
private val AR33 = WeaponData(R.drawable.r6s_wpn_ar33,"AR33", 41, 25, 176, 749)
private val G36C = WeaponData(R.drawable.r6s_wpn_g36c,"G36C", 38, 30, 241, 780)
private val R4_C = WeaponData(R.drawable.r6s_wpn_r4_c,"R4-C", 39, 25, 236, 860)
private val w_556xi = WeaponData(R.drawable.r6s_wpn_556xi,"556xi", 47, 30, 241, 690)
private val F2 = WeaponData(R.drawable.r6s_wpn_f2,"F2", 37, 25, 201, 980)
private val AK_12 = WeaponData(R.drawable.r6s_wpn_ak_12,"AK-12", 45, 30, 241, 850)
private val AUG_A2 = WeaponData(R.drawable.r6s_wpn_aug_a2,"AUG A2", 42, 30, 241, 720)
private val w_552_Commando = WeaponData(R.drawable.r6s_wpn_552_commando,"552 Commando", 43, 30, 241, 690)
private val w_416_C_Carbine = WeaponData(R.drawable.r6s_wpn_416_c_carbine,"416-C Carbine", 38, 25, 241, 740)
private val C8_SFW = WeaponData(R.drawable.r6s_wpn_c8_sfw,"C8-SFW", 40, 30, 241, 837)
private val Mk17_CQB = WeaponData(R.drawable.r6s_wpn_mk17_cqb,"Mk17 CQB", 44, 25, 226, 585)
private val PARA_308 = WeaponData(R.drawable.r6s_wpn_para_308,"PARA-308", 48, 30, 241, 650)
private val Type_89 = WeaponData(R.drawable.r6s_wpn_type_89,"Type-89", 40, 20, 181, 850)
private val C7E = WeaponData(R.drawable.r6s_wpn_c7e,"C7E", 42, 25, 241, 800)
private val M762 = WeaponData(R.drawable.r6s_wpn_m762,"M762", 45, 30, 241, 730)
private val V308 = WeaponData(R.drawable.r6s_wpn_v308,"V308", 44, 50, 201, 700)
private val Spear_308 = WeaponData(R.drawable.r6s_wpn_spear_308,"Spear .308", 42, 30, 241, 700)
private val M4 = WeaponData(R.drawable.r6s_wpn_m4,"M4", 44, 30, 181, 750)
private val AK_74M = WeaponData(R.drawable.r6s_wpn_ak_74m,"AK-74M", 44, 40, 281, 650)
private val ARX200 = WeaponData(R.drawable.r6s_wpn_arx200,"ARX200", 47, 20, 201, 700)
private val F90 = WeaponData(R.drawable.r6s_wpn_f90,"F90", 38, 30, 211, 780)
private val Commando_9 = WeaponData(R.drawable.r6s_wpn_commando_9,"Commando 9", 36, 25, 176, 780)
private val SC3000K = WeaponData(R.drawable.r6s_wpn_sc3000k,"SC3000K", 45, 25, 201, 800)
private val FMG_9 = WeaponData(R.drawable.r6s_wpn_fmg_9,"FMG-9", 34, 30, 181, 800)
private val MP5K = WeaponData(R.drawable.r6s_wpn_mp5k,"MP5K", 30, 30, 181, 800)
private val UMP45 = WeaponData(R.drawable.r6s_wpn_ump45,"UMP45", 38, 25, 176, 600)
private val MP5 = WeaponData(R.drawable.r6s_wpn_mp5,"MP5", 27, 30, 181, 800)
private val P90 = WeaponData(R.drawable.r6s_wpn_p90,"P90", 22, 50, 251, 970)
private val w_9x19VSN = WeaponData(R.drawable.r6s_wpn_9x19vsn,"9x19VSN", 34, 30, 181, 750)
private val MP7 = WeaponData(R.drawable.r6s_wpn_mp7,"MP7", 32, 30, 181, 900)
private val w_9mm_C1 = WeaponData(R.drawable.r6s_wpn_9mm_c1,"9mm C1", 36, 34, 205, 575)
private val MPX = WeaponData(R.drawable.r6s_wpn_mpx,"MPX", 26, 30, 181, 830)
private val M12 = WeaponData(R.drawable.r6s_wpn_m12,"M12", 40, 30, 181, 550)
private val MP5SD = WeaponData(R.drawable.r6s_wpn_mp5sd,"MP5SD", 40, 30, 181, 800)
private val PDW9 = WeaponData(R.drawable.r6s_wpn_pdw9,"PDW9", 34, 50, 301, 800)
private val Vector_45_ACP = WeaponData(R.drawable.r6s_wpn_vector_45_acp,"Vector .45 ACP", 23, 25, 176, 1200)
private val T_5_SMG = WeaponData(R.drawable.r6s_wpn_t_5_smg,"T-5 SMG", 28, 30, 241, 900)
private val Scorpion_EVO_3_A1 = WeaponData(R.drawable.r6s_wpn_scorpion_evo_3_a1,"Scorpion EVO 3 A1", 23, 40, 251, 1080)
private val K1A = WeaponData(R.drawable.r6s_wpn_k1a,"K1A", 36, 30, 241, 720)
private val Mx4_Storm = WeaponData(R.drawable.r6s_wpn_mx4_storm,"Mx4 Storm", 26, 30, 181, 950)
private val AUG_A3 = WeaponData(R.drawable.r6s_wpn_aug_a3,"AUG A3", 36, 31, 187, 700)
private val P10_RONI = WeaponData(R.drawable.r6s_wpn_p10_roni,"P10 RONI", 26, 15, 181, 980)
private val M590A1 = WeaponData(R.drawable.r6s_wpn_m590a1,"M590A1", 48, 7, 36, 85)
private val M1014 = WeaponData(R.drawable.r6s_wpn_m1014,"M1014", 34, 8, 32, 270)
private val SG_CQB = WeaponData(R.drawable.r6s_wpn_sg_cqb,"SG-CQB", 53, 7, 36, 85)
private val SASG_12 = WeaponData(R.drawable.r6s_wpn_sasg_12,"SASG-12", 50, 11, 51, 330)
private val M870 = WeaponData(R.drawable.r6s_wpn_m870,"M870", 60, 7, 36, 100)
private val Super_90 = WeaponData(R.drawable.r6s_wpn_super_90,"Super 90", 35, 8, 32, 200)
private val SPAS_12 = WeaponData(R.drawable.r6s_wpn_spas_12,"SPAS-12", 35, 7, 36, 200)
private val SPAS_15 = WeaponData(R.drawable.r6s_wpn_spas_15,"SPAS-15", 30, 7, 37, 290)
private val SuperNova = WeaponData(R.drawable.r6s_wpn_supernova,"SuperNova", 48, 7, 55, 75)
private val ITA12L = WeaponData(R.drawable.r6s_wpn_ita12l,"ITA12L", 50, 8, 41, 85)
private val SIX12 = WeaponData(R.drawable.r6s_wpn_six12,"SIX12", 35, 6, 36, 200)
private val SIX12_SD = WeaponData(R.drawable.r6s_wpn_six12_sd,"SIX12 SD", 35, 6, 36, 200)
private val FO_12 = WeaponData(R.drawable.r6s_wpn_fo_12,"FO-12", 35, 11, 51, 400)
private val BOSG_12_2 = WeaponData(R.drawable.r6s_wpn_bosg_12_2,"BOSG.12.2", 125, 2, 62, 500)
private val ACS12 = WeaponData(R.drawable.r6s_wpn_acs12,"ACS12", 69, 31, 91, 300)
private val TCSG12 = WeaponData(R.drawable.r6s_wpn_tcsg12,"TCSG12", 63, 10, 511, 450)
private val w_417 = WeaponData(R.drawable.r6s_wpn_417,"417", 69, 20, 161, 450)
private val OTs_03 = WeaponData(R.drawable.r6s_wpn_ots_03,"OTs-03", 71, 15, 41, 380)
private val CAMRS = WeaponData(R.drawable.r6s_wpn_camrs,"CAMRS", 69, 20, 161, 450)
private val SR_25 = WeaponData(R.drawable.r6s_wpn_sr_25,"SR-25", 31, 20, 101, 450)
private val Mk_14_EBR = WeaponData(R.drawable.r6s_wpn_mk_14_ebr,"Mk 14 EBR", 60, 20, 101, 450)
private val AR_15_50 = WeaponData(R.drawable.r6s_wpn_ar_15_50,"AR-15.50", 62, 10, 71, 450)
private val CSRX_300 = WeaponData(R.drawable.r6s_wpn_csrx_300,"CSRX 300", 135, 5, 21, 50)
private val w_6P41 = WeaponData(R.drawable.r6s_wpn_6p41,"6P41", 46, 100, 401, 680)
private val G8A1 = WeaponData(R.drawable.r6s_wpn_g8a1,"G8A1", 37, 50, 301, 850)
private val M249 = WeaponData(R.drawable.r6s_wpn_m249,"M249", 48, 100, 401, 650)
private val T_95_LSW = WeaponData(R.drawable.r6s_wpn_t_95_lsw,"T-95 LSW", 46, 80, 241, 650)
private val LMG_E = WeaponData(R.drawable.r6s_wpn_lmg_e,"LMG-E", 41, 150, 300, 720)
private val ALDA_5_56 = WeaponData(R.drawable.r6s_wpn_alda_5_56,"ALDA 5.56", 35, 80, 241, 900)
private val M249_SAW = WeaponData(R.drawable.r6s_wpn_m249_saw,"M249 SAW", 48, 60, 240, 650)
private val DP27 = WeaponData(R.drawable.r6s_wpn_dp27,"DP27", 60, 70, 140, 550)
private val SMG_11 = WeaponData(R.drawable.r6s_wpn_smg_11,"SMG-11", 32, 16, 97, 1270)
private val Bearing_9 = WeaponData(R.drawable.r6s_wpn_bearing_9,"Bearing 9", 33, 25, 101, 1100)
private val C75_Auto = WeaponData(R.drawable.r6s_wpn_c75_auto,"C75 Auto", 35, 26, 105, 1000)
private val SMG_12 = WeaponData(R.drawable.r6s_wpn_smg_12,"SMG-12", 28, 32, 193, 1270)
private val SPSMG9 = WeaponData(R.drawable.r6s_wpn_spsmg9,"SPSMG9", 33, 20, 161, 980)
private val ITA12S = WeaponData(R.drawable.r6s_wpn_ita12s,"ITA12S", 70, 5, 26, 85)
private val Super_Shorty = WeaponData(R.drawable.r6s_wpn_super_shorty,"Super Shorty", 35, 2, 45, 85)
private val LE_ROC = WeaponData(R.drawable.r6s_wpn_le_roc,"LE ROC SHIELD", 0, 0, 0, 1)
private val BALLISTIC_SHIELD = WeaponData(R.drawable.r6s_wpn_le_roc,"Bouclier ballistique", 0, 0, 0, 1)
private val G52_Tactical_Shield = WeaponData(R.drawable.r6s_wpn_le_roc,"Bouclier G52-TACTIQUE", 0, 0, 0, 1)

private val LFP586 = WeaponData(R.drawable.r6s_wpn_lfp586,"LFP586", 78, 6, 42, 550)

//private val test = WeaponData(R.drawable.r6s_wpn_,"L85A2", 47, 30, 181, 670)
// Définition des unités
private val GIGN = Unity(R.drawable.gign, "GIGN")
private val SAS = Unity(R.drawable.sas, "SAS")
private val RAINBOW = Unity(R.drawable.rainbow, "RAINBOW")
private val FBI_SWAT = Unity(R.drawable.fbi_swat, "FBI SWAT")
private val SPETSNAZ = Unity(R.drawable.spetsnaz, "SPETSNAZ")
private val GSG_9 = Unity(R.drawable.gsg_9, "GSG 9")
private val CANADIAN_ARMY = Unity(R.drawable.canadian_army, "Armée Canadienne")
private val SEAL = Unity(R.drawable.navy_seals, "SEAL")
private val BOPE = Unity(R.drawable.bope, "BOPE")
private val SAT = Unity(R.drawable.sat, "SAT")
private val GEO = Unity(R.drawable.geo, "GEO")
private val SDU = Unity(R.drawable.sdu, "SDU")
private val GROM = Unity(R.drawable.grom, "GROM")
private val u_707th = Unity(R.drawable.u_707th, "707th SMB")


//Définitions des pays
private val FRANCE = Country(R.drawable.fr, "France")
private val USA = Country(R.drawable.us, "Etat-Unis")
private val SCOTLAND = Country(R.drawable.gb_sct, "Scotland")
private val ENGLAND = Country(R.drawable.gb, "Royaume-Uni")
private val RUSSIA = Country(R.drawable.ru, "Russie")
private val ISRAEL = Country(R.drawable.il, "Israël")
private val UZBEKISTAN = Country(R.drawable.uz, "Ouzbékistan")
private val GERMANY = Country(R.drawable.de, "Allemagne")
private val CANADA = Country(R.drawable.ca, "Quebec")
private val BRAZIL = Country(R.drawable.br, "Brésil")
private val JAPAN = Country(R.drawable.jp, "Japon")
private val ITALY = Country(R.drawable.it, "Italie")
private val GREECE = Country(R.drawable.gr, "Grèce")
private val SWITZERLAND = Country(R.drawable.ch, "Suisse")
private val CHINA = Country(R.drawable.cn, "Chine")
private val SPAIN = Country(R.drawable.es, "Espagne")
private val SOUTH_KOREA = Country(R.drawable.kr, "Corée du Sud")
private val POLAND = Country(R.drawable.pl, "Pologne")
private val HONG_KONG = Country(R.drawable.hk, "Hong Kong")

// Initialisation des listes d'opérateurs
val attackersList = listOf(
    OperatorData(R.drawable.striker, "Striker", "Description de Striker", health = 2, speed = 2, listOf(M4, M249), listOf(ITA12S), OperatorPersonalInfo("Non défini", "Non défini", -1, "Non défini", "Non défini", "Non défini", FRANCE, RAINBOW)),
    OperatorData(R.drawable.sledge, "Sledge", "Un ancien expert en explosifs de l'armée royale, Sledge utilise un marteau-piqueur, une arme dévastatrice sur le champ de bataille.", health = 3, speed = 1, listOf(L85A2, M590A1), listOf(LFP586), OperatorPersonalInfo("Seamus Cowden", "2 avril", 35, "1.92m", "95kg", "John o' Groats", SCOTLAND, SAS)),
    OperatorData(R.drawable.thatcher, "Thatcher", "Ancien opérateur des forces spéciales britanniques, Thatcher est un spécialiste de la neutralisation des appareils électroniques ennemis.", health = 3, speed = 1, listOf(AR33, L85A2, M590A1), listOf(LFP586), OperatorPersonalInfo("Gustave Kateb", "16 septembre", 44, "1.77m", "74kg", "Paris", ENGLAND, GIGN)),
    OperatorData(R.drawable.ash, "Ash", "Une ex-officier du FSB, Ash est une opératrice rapide qui utilise un lance-grenades puissant pour détruire les murs.", health = 1, speed = 3, listOf(G36C, R4_C), listOf(LFP586), OperatorPersonalInfo("Eliza Cohen", "24 décembre", 33, "1.70m", "63kg", "Israël", ISRAEL, FBI_SWAT)),
    OperatorData(R.drawable.thermite, "Thermite", "Un ancien ingénieur du Corps des Marines, Thermite est un expert en entrée par explosion et en opérations de brèche.", health = 2, speed = 2, listOf(M1014, w_556xi), listOf(LFP586), OperatorPersonalInfo("Jordan Trace", "14 Mars", 35, "1.78m", "60kg", "Plano, Texas", USA, FBI_SWAT)),
    OperatorData(R.drawable.twitch, "Twitch", "Une experte en électronique et sabotage, Twitch utilise son drone pour désactiver les appareils et caméras ennemis.", health = 2, speed = 2, listOf(F2, w_417, SG_CQB), listOf(LFP586), OperatorPersonalInfo("Emmanuelle Pichon", "12 Octobre", 28, "1.68m", "58kg", "Nancy, Meurthe-et-Moselle", FRANCE, GIGN)),
    OperatorData(R.drawable.montagne, "Montagne", "Un opérateur du GIGN français, Montagne est spécialisé dans le déploiement de boucliers, ce qui lui permet de mener des charges dans des territoires hostiles.", health = 3, speed = 1, listOf(LE_ROC), listOf(LFP586), OperatorPersonalInfo("Gilles Touré", "11 Octobre", 48, "1.90m", "90kg", "Bordeaux, Gironde", FRANCE, GIGN)),
    OperatorData(R.drawable.glaz, "Glaz", "Un tireur d'élite du FSB russe, Glaz utilise une lunette thermique pour effectuer des tirs de précision à longue distance.", health = 1, speed = 3, listOf(OTs_03), listOf(LFP586), OperatorPersonalInfo("Timur Glazkov", "2 Juillet", 30, "1.78m", "79kg", "Vladivostok, Primorsky Krai", RUSSIA, SPETSNAZ)),
    OperatorData(R.drawable.fuze, "Fuze", "Fuze est un opérateur russe spécialisé dans les tactiques de brèche, utilisant son lanceur d'appareils explosifs pour nettoyer les pièces efficacement.", health = 3, speed = 1, listOf(AK_12, w_6P41, BALLISTIC_SHIELD), listOf(LFP586), OperatorPersonalInfo("Shuhrat Kessikbayev", "12 Octobre", 34, "1.80m", "80kg", "Samarkand", UZBEKISTAN, SPETSNAZ)),
    OperatorData(R.drawable.blitz, "Blitz", "Un opérateur allemand spécialisé dans l'aveuglement des ennemis avec son bouclier flash, Blitz mène l'assaut dans des opérations à haut risque.", health = 1, speed = 3, listOf(G52_Tactical_Shield), listOf(LFP586), OperatorPersonalInfo("Elias Kötz", "2 Avril", 37, "1.75m", "75kg", "Brême", GERMANY, GSG_9)),
    OperatorData(R.drawable.iq, "IQ", "IQ est une experte en électronique venant d'Allemagne, capable de localiser les gadgets cachés grâce à son scanner avancé.", health = 1, speed = 3, listOf(AUG_A2, w_552_Commando, G8A1), listOf(LFP586), OperatorPersonalInfo("Monika Weiss", "1 Août", 38, "1.75m", "70kg", "Leipzig, Saxony", GERMANY, GSG_9)),
    OperatorData(R.drawable.buck, "Buck", "Un opérateur canadien ayant une expérience dans l'infanterie et les forces spéciales, Buck est compétent avec une grande variété d'armes et d'outils de brèche.", health = 2, speed = 2, listOf(C8_SFW, CAMRS), listOf(LFP586), OperatorPersonalInfo("Keith McKinley", "23 décembre", 34, "1.83m", "81kg", "Montréal", CANADA, CANADIAN_ARMY)),
    OperatorData(R.drawable.blackbeard, "Blackbeard", "Un opérateur des Navy SEAL américains, Blackbeard est spécialisé dans les opérations défensives avec son bouclier balistique qui le protège pendant les brèches.", health = 3, speed = 1, listOf(Mk17_CQB, SR_25), listOf(LFP586), OperatorPersonalInfo("Craig J. Pearson", "5 novembre", 33, "1.87m", "88kg", "Washington", USA, SEAL)),
    OperatorData(R.drawable.capitao, "Capitao", "Capitao est un opérateur brésilien doté d'un équipement polyvalent, capable de lancer des projectiles incendiaires et de fumée pour le contrôle des foules.", health = 1, speed = 3, listOf(M249, PARA_308), listOf(LFP586), OperatorPersonalInfo("Rafael V. Costa", "25 février", 29, "1.78m", "80kg", "Nova Iguaçu, Rio de Janeiro", BRAZIL, BOPE)),
    OperatorData(R.drawable.hibana, "Hibana", "Hibana est une opératrice japonaise, spécialisée dans les explosifs et les brèches, utilisant son dispositif X-KAIROS pour ouvrir les murs renforcés.", health = 1, speed = 3, listOf(Type_89, SuperNova), listOf(LFP586), OperatorPersonalInfo("Yumiko Imagawa", "12 avril", 28, "1.65m", "55kg", "Nagoya", JAPAN, SAT)),
    OperatorData(R.drawable.jackal, "Jackal", "Jackal est un opérateur espagnol capable de suivre les ennemis à travers leurs empreintes, utilisant son iTAG pour traquer les mouvements et éliminer les menaces.", health = 2, speed = 2, listOf(C7E, PDW9, ITA12L), listOf(LFP586, ITA12S), OperatorPersonalInfo("Ricardo \"Jackal\" Romero", "23 octobre", 33, "1.80m", "85kg", "Ceuta", SPAIN, GEO)),
    OperatorData(R.drawable.ying, "Ying", "Ying est une opératrice chinoise spécialisée dans les gadgets explosifs, utilisant ses dispositifs Candela pour aveugler et désorienter les ennemis avant de pénétrer.", health = 2, speed = 2, listOf(T_95_LSW, SIX12), listOf(LFP586), OperatorPersonalInfo("Lei Ying", "7 février", 26, "1.60m", "56kg", "Central", HONG_KONG, SDU)),
    OperatorData(R.drawable.zofia, "Zofia", "Zofia est une opératrice polonaise possédant des compétences avancées en armement lourd et en explosifs, capable d'utiliser des grenades à concussion et à impact.", health = 3, speed = 1, listOf(LMG_E, M762), listOf(LFP586), OperatorPersonalInfo("Zofia Bosak", "3 janvier", 31, "1.75m", "73kg", "Wrocław, Lower Silesian Voivodeship", POLAND, GROM)),
    OperatorData(R.drawable.dokkaebi, "Dokkaebi", "Dokkaebi est une opératrice sud-coréenne, spécialisée dans le piratage des dispositifs de communication ennemis et l'utilisation de sa Logic Bomb pour perturber les opérations.", health = 1, speed = 3, listOf(Mk_14_EBR, BOSG_12_2), listOf(SMG_12, C75_Auto), OperatorPersonalInfo("Chun-Li Park", "9 octobre", 28, "1.62m", "58kg", "Séoul", SOUTH_KOREA, u_707th)),
    OperatorData(R.drawable.lion, "Lion", "Description de Lion", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.finka, "Finka", "Description de Finka", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.maverick, "Maverick", "Description de Maverick", health = 1, speed = 3, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.nomad, "Nomad", "Description de Nomad", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.gridlock, "Gridlock", "Description de Gridlock", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.nokk, "Nokk", "Description de Nokk", health = 1, speed = 3, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.amaru, "Amaru", "Description de Amaru", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.kali, "Kali", "Description de Kali", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.iana, "Iana", "Description de Iana", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.ace, "Ace", "Description de Ace", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.zero, "Zero", "Description de Zero", health = 1, speed = 3, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.flores, "Flores", "Description de Flores", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.osa, "Osa", "Description de Osa", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.sens, "Sens", "Description de Sens", health = 1, speed = 3, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.grim, "Grim", "Description de Grim", health = 1, speed = 3, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.brava, name = "Brava", description = "Description de Brava", health = 1, speed = 3, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.ram, name = "Ram", description = "Description de Ram", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.deimos, name = "Deimos", description = "Description de Deimos", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN))
)

val defendersList = listOf(
    OperatorData(R.drawable.sentry, "Sentry", "Description de Sentry", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.smoke, "Smoke", "Description de Smoke", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.mute, "Mute", "Description de Mute", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.castle, "Castle", "Description de Castle", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.pulse, "Pulse", "Description de Pulse", health = 1, speed = 3, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.doc, "Doc", "Description de Doc", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.rook, "Rook", "Description de Rook", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.kapkan, "Kapkan", "Description de Kapkan", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.tachanka, "Tachanka", "Description de Tachanka", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.jager, "Jager", "Description de Jager", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.bandit, "Bandit", "Description de Bandit", health = 1, speed = 3, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.frost, "Frost", "Description de Frost", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.valkyrie, "Valkyrie", "Description de Valkyrie", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.caveira, "Caveira", "Description de Caveira", health = 1, speed = 3, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.echo, "Echo", "Description de Echo", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.mira, "Mira", "Description de Mira", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.lesion, "Lesion", "Description de Lesion", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.ela, "Ela", "Description de Ela", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.vigil, "Vigil", "Description de Vigil", health = 1, speed = 3, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.maestro, "Maestro", "Description de Maestro", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.alibi, "Alibi", "Description de Alibi", health = 1, speed = 3, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.clash, "Clash", "Description de Clash", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.kaid, "Kaid", "Description de Kaid", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.mozzie, "Mozzie", "Description de Mozzie", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.warden, "Warden", "Description de Warden", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.goyo, "Goyo", "Description de Goyo", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.wamai, "Wamai", "Description de Wamai", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.oryx, "Oryx", "Description de Oryx", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.melusi, "Melusi", "Description de Melusi", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.aruni, "Aruni", "Description de Aruni", health = 3, speed = 1, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.thunderbird, "Thunderbird", "Description de Thunderbird", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.thorn, "Thorn", "Description de Thorn", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.azami, "Azami", "Description de Azami", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.solis, "Solis", "Description de Solis", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.fenrir, "Fenrir", "Description de Fenrir", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.tubarao, "Tubarao", "Description de Tubarao", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN)),
    OperatorData(R.drawable.skopos, "Skopos", "Description de Skopos", health = 2, speed = 2, listOf(R4_C, L85A2, AR33), listOf(G36C), OperatorPersonalInfo("Gustave Kateb", "16 Septembre", 44, "1,77m", "74kg", "Paris", FRANCE, GIGN))
)