package com.github.quiram.challenges.medium.legoblocks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResultTest {

    @ParameterizedTest
    @CsvSource({
            "1,1,1",
            "1,2,1",
            "1,3,1",
            "1,4,1",
            "2,2,3",
            "2,3,9",
            "3,2,7",
            "4,4,3375",
            "1,5,0",
            "4,5,35714",
            "8,6,402844528",
            "7,3,16129",
            "3,8,328650",
            "4,7,5562914",
            "3,7,57252",
            "8,10,634597424",
            "3,4,343",
            "10,3,1046529",
            "10,8,797528970",
            "2,3,9",
            "2,10,3658",
            "9,5,908059021",
            "4,7,5562914",
            "7,4,2048383",
            "7,2,127",
            "5,8,225730660",
            "7,10,665164408",
            "5,6,16164270",
            "5,8,225730660",
            "4,1,1",
            "7,9,679290629",
            "4,2,15",
            "3,1,1",
            "10,3,1046529",
            "5,10,317560026",
            "5,9,602778662",
            "8,3,65025",
            "3,7,57252",
            "7,2,127",
            "5,10,317560026",
            "2,8,674",
            "2,6,122",
            "8,7,488563306",
            "7,6,123659398",
            "10,5,361706686",
            "3,10,10798230",
            "1,9,0",
            "1,10,0",
            "9,6,440285735",
            "2,6,122",
            "5,9,602778662",
            "4,1,1",
            "5,5,634320",
            "4,2,15",
            "10,7,354096365",
            "8,9,361993166",
            "5,2,31",
            "10,8,797528970",
            "9,9,6361204",
            "9,10,662635028",
            "4,4,3375",
            "7,1,1",
            "9,9,6361204",
            "8,7,488563306",
            "1,4,1",
            "3,6,9870",
            "6,10,707572511",
            "10,3,1046529",
            "8,8,686349893",
            "9,2,511",
            "10,4,70599160",
            "1,3,1",
            "6,2,63",
            "9,6,440285735",
            "5,7,408221460",
            "9,7,658440481",
            "5,8,225730660",
            "1,7,0",
            "10,1,1",
            "4,2,15",
            "4,5,35714",
            "10,2,1023",
            "10,4,70599160",
            "1,6,0",
            "5,1,1",
            "7,3,16129",
            "6,7,276165628",
            "8,3,65025",
            "10,10,30175125",
            "3,8,328650",
            "4,3,225",
            "10,10,30175125",
            "10,2,1023",
            "6,9,351872159",
            "5,9,602778662",
            "3,10,10798230",
            "1,5,0",
            "3,1,1",
            "3,10,10798230",
            "9,4,133432831",
            "5,1,1",
            "10,7,354096365",
            "5,5,634320",
            "4,7,5562914",
            "1,3,1",
            "4,6,447902",
            "5,4,29791",
            "7,10,665164408",
            "3,7,57252",
            "3,9,1878696",
            "529,190,461438538",
            "873,909,84071244",
            "959,499,139909293",
            "37,809,280936480",
            "754,249,18141539",
            "304,334,572707190",
            "134,649,268703862",
            "891,755,798645255",
            "568,747,839582658",
            "369,530,442448653",
            "501,47,405763153",
            "789,798,476959008",
            "250,991,299759023",
            "304,34,893481715",
            "364,498,580495726",
            "254,893,207596656",
            "687,126,50346795",
            "153,997,5816159",
            "976,189,854328571",
            "158,730,30359068",
            "437,461,990879429",
            "415,922,236665144",
            "461,305,55368576",
            "29,28,968974243",
            "51,749,755434907",
            "557,903,398639311",
            "795,698,188927172",
            "700,44,146100939",
            "40,3,473400982",
            "429,404,99662215",
            "501,682,384644561",
            "648,539,593000989",
            "160,152,685391950",
            "536,135,881511196",
            "340,693,45506542",
            "216,128,24488248",
            "505,630,154934056",
            "50,965,946280275",
            "286,430,997589216",
            "344,336,407841220",
            "178,901,847825989",
            "239,972,241284298",
            "950,290,127183290",
            "368,989,639906462",
            "293,796,739429871",
            "744,145,382742649",
            "830,391,355021084",
            "683,341,847133356",
            "542,570,335220283",
            "827,233,74982118",
            "262,43,192731203",
            "361,118,861283669",
            "24,762,273115803",
            "82,310,836930511",
            "191,426,574915505",
            "997,368,69935829",
            "678,235,322627886",
            "691,627,639467247",
            "525,58,741273001",
            "615,169,268192460",
            "206,359,190298816",
            "313,387,343753682",
            "101,347,581139396",
            "727,995,473244817",
            "917,553,100251879",
            "579,530,55174401",
            "947,291,921158253",
            "648,971,818849197",
            "52,81,468700183",
            "632,594,7143521",
            "858,628,900730938",
            "313,887,453347876",
            "215,356,855054716",
            "513,91,416740010",
            "413,480,438577320",
            "611,970,328632941",
            "190,275,330435572",
            "356,642,498014036",
            "621,434,251419758",
            "988,889,35823653",
            "339,567,558071208",
            "771,285,953984637",
            "857,418,284016728",
            "607,261,311988940",
            "850,238,723157229",
            "206,60,71349507",
            "218,519,660965871",
            "946,784,867651602",
            "874,459,796968271",
            "874,638,241380886",
            "290,484,640024917",
            "608,479,343618701",
            "758,315,433948145",
            "472,730,456869602",
            "101,460,504963522",
            "619,439,506817592",
            "26,389,497949307",
            "75,234,616499431",
            "158,682,656627236",
            "494,359,929413052",
            "271,700,820286798",
            "418,840,336082008",
            "570,364,487244999",
            "623,795,940472633",
            "174,848,891909552",
            "432,463,41392131",
            "683,391,539075773",
            "293,792,534496193",
            "58,116,638706983",
            "522,158,75175175",
            "575,492,316908099",
            "948,952,115618020",
            "232,22,297994145",
            "538,741,82228217",
            "55,31,335734596",
            "99,326,939848822",
            "82,517,238272159",
            "517,3,463545918",
            "232,140,470091199",
            "797,405,862021051",
            "339,581,622301325",
            "219,22,969519145",
            "971,863,942029357",
            "813,380,255205385",
            "978,686,140810219",
            "537,905,6351698",
            "177,484,458619665",
            "208,760,198717374",
            "858,745,801661000",
            "500,912,899076225",
            "128,951,185871272",
            "237,561,361516813",
            "819,106,504477187",
            "564,50,684982876",
            "245,712,105821328",
            "806,935,323921695",
            "292,376,363375078",
            "956,615,202809439",
            "590,769,361285372",
            "994,919,863812967",
            "806,883,696611910",
            "823,983,932262309",
            "718,31,43647133",
            "94,575,850866720",
            "127,594,487559646",
            "487,254,703110442",
            "544,75,837972545",
            "815,714,755244757",
            "180,378,911354331",
            "763,776,250719467",
            "89,920,562944065",
            "711,733,939691164",
            "295,18,395344310",
            "347,236,437348460",
            "138,692,344036805",
            "154,944,354220778",
            "574,329,547309166",
            "926,292,531226739",
            "711,19,737576556",
            "218,837,276301613",
            "964,56,626537240",
            "91,859,581146803",
            "131,905,552449512",
            "572,662,867993430",
            "634,686,782191344",
            "790,74,537335349",
            "605,852,503857352",
            "806,251,749459675",
            "869,504,997928360",
            "486,7,710686187",
            "196,640,857326580",
            "950,121,664339032",
            "968,227,369357913",
            "764,678,503874520",
            "597,982,66817190",
            "866,561,176898564",
            "37,956,972568677",
            "771,519,403106942",
            "212,343,182753566",
            "533,197,248721834",
            "380,322,405249017",
            "271,985,428777905",
            "173,428,920520729",
            "235,41,672442159",
            "284,73,485193636",
            "399,831,808070078",
            "64,348,745671033",
            "951,31,328526930",
            "574,715,489099791",
            "60,523,119700904",
            "48,925,837872312",
            "83,436,102090432",
            "233,205,748476684",
            "955,444,631558498",
            "899,487,8624778",
            "641,279,871864258",
            "160,263,248011337",
            "263,684,910965790",
            "42,849,805403415",
            "724,325,466449632",
    })
    void legoBlocks(int n, int m, int result) {
        final int actual = Result.legoBlocks(n, m);
        assertEquals(result, actual);
    }
}