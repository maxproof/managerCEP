package ch.mmi.cep.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class SwissCitiesBank {
	
	public Map<String, String> populateSwissCitiesList() {
	Map<String, String> swissCitiesList = new LinkedHashMap<>();
	swissCitiesList.put("1000", "Lausanne 25");
	return swissCitiesList;
	}	
}

/*Lausanne 25	1000
Lausanne 26	1000
Lausanne 27	1000
Lausanne	1003
Lausanne	1004
Lausanne	1005
Lausanne	1006
Lausanne	1007
Prilly	1008
Jouxtens-Mézery	1008
Pully	1009
Lausanne	1010
Lausanne	1011
Lausanne	1012
Lausanne	1015
Lausanne	1018
Renens VD	1020
Chavannes-près-Renens	1022
Crissier	1023
Ecublens VD	1024
St-Sulpice VD	1025
Denges	1026
Echandens	1026
Lonay	1027
Préverenges	1028
Villars-Ste-Croix	1029
Bussigny	1030
Mex VD	1031
Romanel-sur-Lausanne	1032
Cheseaux-sur-Lausanne	1033
Boussens	1034
Bournens	1035
Sullens	1036
Etagnières	1037
Bercher	1038
Echallens	1040
Villars-le-Terroir	1040
St-Barthélemy VD	1040
Dommartin	1041
Montaubion-Chardonney	1041
Naz	1041
Poliez-le-Grand	1041
Poliez-Pittet	1041
Bottens	1041
Assens	1042
Bioley-Orjulaz	1042
Bettens	1042
Sugnens	1043
Fey	1044
Ogens	1045
Rueyres	1046
Oppens	1047
Le Mont-sur-Lausanne	1052
Cugy VD	1053
Bretigny-sur-Morrens	1053
Morrens VD	1054
Froideville	1055
Villars-Tiercelin	1058
Peney-le-Jorat	1059
Villars-Mendraz	1061
Sottens	1062
Chapelle-sur-Moudon	1063
Martherenges	1063
Boulens	1063
Peyres-Possens	1063
Epalinges	1066
Les Monts-de-Pully	1068
Puidoux	1070
Chexbres	1071
Rivaz	1071
St-Saphorin (Lavaux)	1071
Forel (Lavaux)	1072
Savigny	1073
Mollie-Margot	1073
Ferlens VD	1076
Servion	1077
Essertes	1078
Les Cullayes	1080
Montpreveyres	1081
Corcelles-le-Jorat	1082
Mézières VD	1083
Carrouge VD	1084
Vulliens	1085
Ropraz	1088
La Croix (Lutry)	1090
Grandvaux	1091
Aran	1091
Chenaux	1091
Belmont-sur-Lausanne	1092
La Conversion	1093
Paudex	1094
Lutry	1095
Cully	1096
Villette (Lavaux)	1096
Riex	1097
Epesses	1098
Morges	1110
Echichens	1112
St-Saphorin-sur-Morges	1113
Colombier VD	1114
Vullierens	1115
Cottens VD	1116
Grancy	1117
Bremblens	1121
Romanel-sur-Morges	1122
Aclens	1123
Gollion	1124
Monnaz	1125
Vaux-sur-Morges	1126
Clarmont	1127
Reverolle	1128
Tolochenaz	1131
Lully VD	1132
Vufflens-le-Château	1134
Chigny	1134
Denens	1135
Bussy-Chardonney	1136
Sévery	1141
Pampigny	1142
Apples	1143
Ballens	1144
Bière	1145
Mollens VD	1146
Montricher	1147
L'Isle	1148
Mauraz	1148
Villars-Bozon	1148
Cuarnens	1148
Mont-la-Ville	1148
La Praz	1148
Chavannes-le-Veyron	1148
Moiry VD	1148
La Coudre	1148
Berolle	1149
St-Prex	1162
Etoy	1163
Buchillon	1164
Allaman	1165
Perroy	1166
Lussy-sur-Morges	1167
Villars-sous-Yens	1168
Yens	1169
Aubonne	1170
Bougy-Villars	1172
Féchy	1173
Montherod	1174
Pizy	1174
Lavigny	1175
St-Livres	1176
Rolle	1180
Tartegnin	1180
Gilly	1182
Bursins	1183
Luins	1184
Vinzel	1184
Mont-sur-Rolle	1185
Essertines-sur-Rolle	1186
St-Oyens	1187
Gimel	1188
St-George	1188
Saubraz	1189
Dully	1195
Bursinel	1195
Gland	1196
Prangins	1197
Genève	1201
Genève	1202
Genève	1203
Genève	1204
Genève	1205
Genève	1206
Genève	1207
Genève	1208
Genève	1209
Grand-Lancy	1212
Petit-Lancy	1213
Onex	1213
Vernier	1214
Genève	1215
Cointrin	1216
Meyrin	1217
Le Grand-Saconnex	1218
Le Lignon	1219
Aïre	1219
Châtelaine	1219
Les Avanchets	1220
Vésenaz	1222
Cologny	1223
Chêne-Bougeries	1224
Chêne-Bougeries	1224
Chêne-Bourg	1225
Thônex	1226
Thônex	1226
Carouge GE	1227
Les Acacias	1227
Plan-les-Ouates	1228
Conches	1231
Confignon	1232
Bernex	1233
Vessy	1234
Cartigny	1236
Avully	1237
Collex	1239
Puplinge	1241
Satigny	1242
Presinge	1243
Choulex	1244
Collonge-Bellerive	1245
Corsier GE	1246
Anières	1247
Hermance	1248
Gy	1251
Meinier	1252
Vandoeuvres	1253
Jussy	1254
Veyrier	1255
Troinex	1256
La Croix-de-Rozon	1257
Perly	1258
Nyon	1260
Marchissy	1261
Le Vaud	1261
Longirod	1261
Eysins	1262
Crassier	1263
St-Cergue	1264
La Cure	1265
Duillier	1266
Vich	1267
Coinsins	1267
Begnins	1268
Burtigny	1268
Bassins	1269
Trélex	1270
Givrins	1271
Genolier	1272
Arzier-Le Muids	1273
Signy	1274
Grens	1274
Chéserex	1275
Gingins	1276
Borex	1277
Arnex-sur-Nyon	1277
La Rippe	1278
Chavannes-de-Bogis	1279
Bogis-Bossey	1279
Russin	1281
La Plaine	1283
Dardagny	1283
Chancy	1284
Athenaz (Avusy)	1285
Soral	1286
Laconnex	1287
Aire-la-Ville	1288
Versoix	1290
Chavannes-des-Bois	1290
Commugny	1291
Chambésy	1292
Bellevue	1293
Genthod	1294
Mies	1295
Tannay	1295
Coppet	1296
Founex	1297
Céligny	1298
Céligny	1298
Crans-près-Céligny	1299
Vufflens-la-Ville	1302
Penthaz	1303
Cossonay-Ville	1304
Dizy	1304
Allens	1304
Senarclens	1304
Penthalaz	1305
Daillens	1306
Lussery-Villars	1307
La Chaux (Cossonay)	1308
Eclépens	1312
Ferreyres	1313
La Sarraz	1315
Chevilly	1316
Orny	1317
Pompaples	1318
Arnex-sur-Orbe	1321
Croy	1322
Romainmôtier	1323
Premier	1324
Vaulion	1325
Juriens	1326
Bretonnières	1329
Vallorbe	1337
Ballaigues	1338
Orient	1341
Le Pont	1342
Les Charbonnières	1343
L'Abbaye	1344
Le Lieu	1345
Le Séchey	1345
Les Bioux	1346
Le Sentier	1347
Le Solliat	1347
Le Brassus	1348
Orbe	1350
Agiez	1352
Bofflens	1353
Montcherand	1354
L'Abergement	1355
Sergey	1355
Les Clées	1356
La Russille	1356
Lignerolle	1357
Valeyres-sous-Rances	1358
Bavois	1372
Chavornay	1373
Corcelles-sur-Chavornay	1374
Penthéréaz	1375
Goumoens-la-Ville	1376
Eclagnens	1376
Goumoens-le-Jux	1376
Oulens-sous-Echallens	1377
Yverdon-les-Bains	1400
Cheseaux-Noréaz	1400
Cuarny	1404
Villars-Epeney	1404
Pomy	1405
Cronay	1406
Donneloye	1407
Gossens	1407
Mézery-près-Donneloye	1407
Bioley-Magnoux	1407
Prahins	1408
Chanéaz	1409
Thierrens	1410
Correvon	1410
Denezy	1410
Prévondavaux	1410
St-Cierges	1410
Valeyres-sous-Ursins	1412
Ursins	1412
Orzens	1413
Molondin	1415
Démoret	1415
Pailly	1416
Essertines-sur-Yverdon	1417
Epautheyres	1417
Vuarrens	1418
Fiez	1420
Fontaines-sur-Grandson	1421
Grandevent	1421
Grandson	1422
Villars-Burquin	1423
Fontanezier	1423
Romairon	1423
Vaugondry	1423
Champagne	1424
Onnens VD	1425
Concise	1426
Corcelles-près-Concise	1426
Bonvillars	1427
Provence	1428
Mutrux	1428
Giez	1429
Orges	1430
Vugelles-La Mothe	1431
Novalles	1431
Belmont-sur-Yverdon	1432
Gressy	1432
Suchy	1433
Ependes VD	1434
Essert-Pittet	1435
Treycovagnes	1436
Chamblon	1436
Suscévaz	1437
Mathod	1438
Rances	1439
Valeyres-sous-Montagny	1441
Montagny-près-Yverdon	1442
Champvent	1443
Essert-sous-Champvent	1443
Villars-sous-Champvent	1443
Vuiteboeuf	1445
Baulmes	1446
Ste-Croix	1450
La Sagne (Ste-Croix)	1450
Le Château-de-Ste-Croix	1450
Les Rasses	1452
Bullet	1453
Mauborget	1453
L'Auberson	1454
La Vraconnaz	1454
Yvonand	1462
Rovray	1463
Chavannes-le-Chêne	1464
Chêne-Pâquier	1464
Cheyres	1468
Estavayer-le-Lac	1470
Lully FR	1470
Seiry	1470
Bollion	1470
Font	1473
Châtillon FR	1473
Châbles FR	1474
Autavaux	1475
Forel FR	1475
Montbrelloz	1475
Cugy FR	1482
Montet (Broye)	1483
Frasses	1483
Vesin	1483
Aumont	1484
Granges-de-Vesin	1484
Nuvilly	1485
Vuissens	1486
Murist	1489
Vucherens	1509
Moudon	1510
Syens	1510
Chavannes-sur-Moudon	1512
Hermenches	1513
Rossenges	1513
Bussy-sur-Moudon	1514
Villars-le-Comte	1515
Neyruz-sur-Moudon	1515
Curtilles	1521
Lucens	1522
Oulens-sur-Lucens	1522
Granges-près-Marnand	1523
Marnand	1524
Henniez	1525
Seigneux	1525
Forel-sur-Lucens	1526
Cremin	1526
Villeneuve FR	1527
Surpierre	1528
Praratoud	1528
Cheiry	1529
Payerne	1530
Fétigny	1532
Ménières	1533
Sassel	1534
Chapelle (Broye)	1534
Combremont-le-Grand	1535
Combremont-le-Petit	1536
Champtauroz	1537
Treytorrens (Payerne)	1538
Bussy FR	1541
Morens FR	1541
Sévaz	1541
Rueyres-les-Prés	1542
Grandcour	1543
Gletterens	1544
Chevroux	1545
Vers-chez-Perrin	1551
Trey	1552
Châtonnaye	1553
Sédeilles	1554
Rossens VD	1554
Villarzel	1555
Corcelles-près-Payerne	1562
Dompierre FR	1563
Domdidier	1564
Missy	1565
Vallon	1565
St-Aubin FR	1566
Les Friques	1566
Delley	1567
Portalban	1568
Avenches	1580
Oleyres	1580
Donatyre	1580
Villarepos	1583
Villars-le-Grand	1584
Salavaux	1585
Bellerive VD	1585
Cotterd	1585
Vallamand	1586
Montmagny	1587
Constantine	1587
Cudrefin	1588
Chabrey	1589
Faoug	1595
Clavaleyres	1595
Palézieux	1607
Palézieux-Village	1607
Les Tavernes	1607
Les Thioleyres	1607
Oron-le-Châtel	1608
Bussigny-sur-Oron	1608
Chesalles-sur-Oron	1608
Chapelle (Glâne)	1608
St-Martin FR	1609
Besencens	1609
Fiaugères	1609
Fiaugères	1609
Oron-la-Ville	1610
Châtillens	1610
Vuibroye	1610
Le Crêt-près-Semsales	1611
Ecoteaux	1612
Maracon	1613
Granges (Veveyse)	1614
Bossonnens	1615
Attalens	1616
Remaufens	1617
Tatroz	1617
Châtel-St-Denis	1618
Les Paccots	1619
Semsales	1623
La Verrerie	1624
Grattavache	1624
Progens	1624
Progens	1624
Sâles (Gruyère)	1625
Maules	1625
Romanens	1626
Treyfayes	1626
Rueyres-Treyfayes	1626
Vaulruz	1627
Vuadens	1628
Bulle	1630
Riaz	1632
Marsens	1633
Vuippens	1633
La Roche FR	1634
La Tour-de-Trême	1635
Broc	1636
Charmey (Gruyère)	1637
Morlon	1638
Sorens	1642
Gumefens	1643
Avry-devant-Pont	1644
Le Bry	1645
Echarlens	1646
Corbières	1647
Hauteville	1648
Pont-la-Ville	1649
Villarvolard	1651
Botterens	1652
Villarbeney	1652
Crésuz	1653
Châtel-sur-Montsalvens	1653
Cerniat FR	1654
Jaun	1656
Im Fang	1656
Abländschen	1657
Rossinière	1658
La Tine	1658
Rougemont	1659
Flendruz	1659
Château-d'Oex	1660
Les Moulins	1660
L'Etivaz	1660
La Lécherette	1660
Le Pâquier-Montbarry	1661
Gruyères	1663
Pringy	1663
Epagny	1663
Moléson-sur-Gruyères	1663
Estavannens	1665
Grandvillard	1666
Villars-sous-Mont	1666
Enney	1667
Albeuve	1669
Lessoc	1669
Les Sciernes-d'Albeuve	1669
Neirivue	1669
Montbovon	1669
Ursy	1670
Bionnens	1670
Esmonts	1670
Promasens	1673
Gillarens	1673
Auboranges	1673
Ecublens FR	1673
Rue	1673
Vuarmarens	1674
Montet (Glâne)	1674
Morlens	1674
Vauderens	1675
Blessens	1675
Mossel	1675
Chavannes-les-Forts	1676
Prez-vers-Siviriez	1677
Siviriez	1678
Villaraboud	1679
Romont FR	1680
Berlens	1680
Billens	1681
Hennens	1681
Prévonloup	1682
Lovatens	1682
Dompierre VD	1682
Villars-Bramard	1682
Cerniaz VD	1682
Brenles	1683
Chesalles-sur-Moudon	1683
Sarzens	1683
Mézières FR	1684
Villariaz	1685
Grangettes-près-Romont	1686
La Neirigue	1686
Vuisternens-devant-Romont	1687
La Magne	1687
Estévenens	1687
Sommentier	1688
Lieffrens	1688
Le Châtelard-près-Romont	1689
Villaz-St-Pierre	1690
Lussy FR	1690
Villarimboud	1691
Massonnens	1692
Villarsiviriaux	1694
Villargiroud	1694
Orsonnens	1694
Chavannes-sous-Orsonnens	1694
Villarlod	1695
Rueyres-St-Laurent	1695
Estavayer-le-Gibloux	1695
Villarsel-le-Gibloux	1695
Vuisternens-en-Ogoz	1696
La Joux FR	1697
Les Ecasseys	1697
Porsel	1699
Porsel	1699
Pont (Veveyse)	1699
Bouloz	1699
Fribourg	1700
Tafers	1712
St. Antoni	1713
Heitenried	1714
Alterswil FR	1715
Plaffeien	1716
Oberschrot	1716
Schwarzsee	1716
St. Ursen	1717
Rechthalten	1718
Brünisried	1719
Zumholz	1719
Corminboeuf	1720
Chésopelloz	1720
Misery	1721
Cormérod	1721
Courtion	1721
Cournillens	1721
Bourguillon	1722
Marly	1723
Villarsel-sur-Marly	1723
Pierrafortscha	1723
Le Mouret	1724
Essert FR	1724
Ferpicloz	1724
Montévraz	1724
Oberried FR	1724
Senèdes	1724
Zénauva	1724
Bonnefontaine	1724
Posieux	1725
Farvagny	1726
Farvagny-le-Petit	1726
Grenilles	1726
Posat	1726
Corpataux	1727
Magnedens	1727
Rossens FR	1728
Ecuvillens	1730
Ependes FR	1731
Arconciel	1732
Treyvaux	1733
Tentlingen	1734
Giffers	1735
St. Silvester	1736
Plasselb	1737
Sangernboden	1738
Neyruz FR	1740
Cottens FR	1741
Autigny	1742
Chénens	1744
Lentigny	1745
Prez-vers-Noréaz	1746
Corserey	1747
Torny-le-Grand	1748
Middes	1749
Villars-sur-Glâne	1752
Matran	1753
Rosé	1754
Corjolens	1754
Avry-sur-Matran	1754
Onnens FR	1756
Lovens	1756
Noréaz	1757
Givisiez	1762
Granges-Paccot	1763
Grolley	1772
Nierlet-les-Bois	1772
Ponthaux	1772
Léchelles	1773
Chandon	1773
Russy	1773
Cousset	1774
Cousset	1774
Montagny-les-Monts	1774
Mannens	1775
Grandsivaz	1775
Montagny-la-Ville	1776
Belfaux	1782
Autafond	1782
Lossy	1782
La Corbaz	1782
Cormagens	1782
Formangueires	1782
Pensier	1783
Barberêche	1783
Courtepin	1784
Wallenried	1784
Cressier FR	1785
Sugiez	1786
Môtier (Vully)	1787
Mur (Vully) FR	1787
Mur (Vully) VD	1787
Praz (Vully)	1788
Lugnorre	1789
Courtaman	1791
Cordast	1792
Guschelmuth	1792
Jeuss	1793
Salvenach	1794
Courlevon	1795
Courgevaux	1796
Münchenwiler	1797
Vevey	1800
Le Mont-Pèlerin	1801
Corseaux	1802
Chardonne	1803
Corsier-sur-Vevey	1804
Jongny	1805
St-Légier-La Chiésaz	1806
Blonay	1807
Les Monts-de-Corsier	1808
Fenil-sur-Corsier	1809
La Tour-de-Peilz	1814
Clarens	1815
Chailly-Montreux	1816
Brent	1817
Montreux	1820
Territet	1820
Veytaux	1820
Chernex	1822
Glion	1823
Caux	1824
Chamby	1832
Villard-sur-Chamby	1832
Les Avants	1833
Villeneuve VD	1844
Noville	1845
Chessel	1846
Rennaz	1847
Roche VD	1852
Yvorne	1853
Leysin	1854
Corbeyrier	1856
Aigle	1860
Les Mosses	1862
La Comballaz	1862
Le Sépey	1863
Vers-l'Eglise	1864
Les Diablerets	1865
La Forclaz VD	1866
Ollon VD	1867
St-Triphon	1867
Panex	1867
Collombey	1868
Massongex	1869
Monthey	1870
Monthey	1870
Choëx	1871
Les Giettes	1871
Troistorrents	1872
Val-d'Illiez	1873
Champoussin	1873
Les Crosets	1873
Champéry	1874
Morgins	1875
Bex	1880
Frenières-sur-Bex	1880
Fenalet-sur-Bex	1880
Les Plans-sur-Bex	1880
Les Posses-sur-Bex	1880
Gryon	1882
Villars-sur-Ollon	1884
Arveyes	1884
Huémoz	1884
Chesières	1885
St-Maurice	1890
Mex VS	1890
Vérossaz	1891
Lavey-Village	1892
Lavey-les-Bains	1892
Morcles	1892
Muraz (Collombey)	1893
Vionnaz	1895
Vouvry	1896
Miex	1896
Bouveret	1897
Les Evouettes	1897
St-Gingolph	1898
Torgon	1899
Evionnaz	1902
Collonges	1903
Vernayaz	1904
Dorénaz	1905
Charrat	1906
Saxon	1907
Riddes	1908
Ovronnaz	1911
Mayens-de-Chamoson	1911
Leytron	1912
Produit (Leytron)	1912
Montagnon (Leytron)	1912
Dugny (Leytron)	1912
Saillon	1913
Saillon	1913
Isérables	1914
Auddes-sur-Riddes	1914
La Tzoumaz	1918
Martigny	1920
Martigny-Croix	1921
Salvan	1922
Les Granges (Salvan)	1922
Les Marécottes	1923
Le Trétien	1923
Finhaut	1925
Le Châtelard VS	1925
Fully	1926
Chemin	1927
Ravoire	1928
Trient	1929
Bovernier	1932
Les Valettes (Bovernier)	1932
Sembrancher	1933
Vens (Sembrancher)	1933
Chamoille (Sembrancher)	1933
La Garde (Sembrancher)	1933
Le Châble VS	1934
Bruson	1934
Verbier	1936
Orsières	1937
Champex-Lac	1938
Vollèges	1941
Cries (Vollèges)	1941
Levron	1942
Praz-de-Fort	1943
La Fouly VS	1944
Liddes	1945
Fontaine Dessus (Liddes)	1945
Fontaine Dessous (Liddes)	1945
Dranse (Liddes)	1945
Chandonne (Liddes)	1945
Rive Haute (Liddes)	1945
Fornex (Liddes)	1945
Les Moulins VS (Liddes)	1945
Vichères (Liddes)	1945
Palasuit (Liddes)	1945
Chez Petit (Liddes)	1945
Petit Vichères (Liddes)	1945
Bourg-St-Pierre	1946
Versegères	1947
Champsec	1947
Lourtier	1948
Fionnay	1948
Sarreyer	1948
Sion	1950
Chamoson	1955
Les Vérines (Chamoson)	1955
Némiaz (Chamoson)	1955
Grugnay (Chamoson)	1955
St-Pierre-de-Clages	1955
Ardon	1957
St-Léonard	1958
Uvrier	1958
Vernamiège	1961
Pont-de-la-Morge (Sion)	1962
Vétroz	1963
Conthey	1964
Roumaz (Savièse)	1965
Granois (Savièse)	1965
St-Germain (Savièse)	1965
Ormône (Savièse)	1965
Mayens-de-la-Zour (Savièse)	1965
Chandolin (Savièse)	1965
Drône (Savièse)	1965
Monteiller (Savièse)	1965
Diolly (Savièse)	1965
La Muraz (Savièse)	1965
Fortunau (Ayent)	1966
Luc (Ayent)	1966
St-Romain (Ayent)	1966
Saxonne (Ayent)	1966
Villa (Ayent)	1966
La Place (Ayent)	1966
Botyre (Ayent)	1966
Blignou (Ayent)	1966
Argnou (Ayent)	1966
Signèse (Ayent)	1966
Bramois	1967
Mase	1968
St-Martin VS	1969
Liez (St-Martin)	1969
Trogne (St-Martin)	1969
Suen (St-Martin)	1969
Eison (St-Martin)	1969
Grimisuat	1971
Champlan (Grimisuat)	1971
Anzère	1972
Nax	1973
Arbaz	1974
St-Séverin	1975
Erde	1976
Aven	1976
Daillon	1976
Icogne	1977
Lens	1978
Vex	1981
Euseigne	1982
Evolène	1983
Lanna	1983
Les Haudères	1984
La Tour VS	1984
La Sage	1985
La Forclaz VS	1985
Villa (Evolène)	1985
Arolla	1986
Hérémence	1987
Thyon	1988
Les Collons	1988
Salins	1991
Arvillard (Salins)	1991
Pravidondaz (Salins)	1991
Turin (Salins)	1991
Misériez (Salins)	1991
Les Agettes	1992
Les Mayens-de-Sion	1992
La Vernaz (Les Agettes)	1992
Crête-à-l'Oeil (Les Agettes)	1992
Veysonnaz	1993
Clèbes (Nendaz)	1993
Aproz (Nendaz)	1994
Basse-Nendaz	1996
Fey (Nendaz)	1996
Bieudron (Nendaz)	1996
Condémines (Nendaz)	1996
Saclentse	1996
Baar (Nendaz)	1996
Beuson (Nendaz)	1996
Brignon (Nendaz)	1996
Haute-Nendaz	1997
Siviez (Nendaz)	1997
Sornard (Nendaz)	1997
Neuchâtel	2000
Auvernier	2012
Colombier NE	2013
Bôle	2014
Areuse	2015
Cortaillod	2016
Boudry	2017
Rochefort	2019
Chambrelien	2019
Bevaix	2022
Gorgier	2023
St-Aubin-Sauges	2024
Chez-le-Bart	2025
Montalchez	2027
Fresens	2027
Vaumarcus	2028
Peseux	2034
Corcelles NE	2035
Cormondrèche	2036
Montmollin	2037
Montezillon	2037
Valangin	2042
Boudevilliers	2043
Fontaines NE	2046
Fontainemelon	2052
La Vue-des-Alpes	2052
Cernier	2053
Chézard-St-Martin	2054
Les Vieux-Prés	2054
Dombresson	2056
Villiers	2057
Le Pâquier NE	2058
Vilars NE	2063
Engollon	2063
Fenin	2063
Saules	2063
Savagnier	2065
Chaumont	2067
Hauterive NE	2068
St-Blaise	2072
Enges	2073
Marin-Epagnier	2074
Thielle	2075
Wavre	2075
Cornaux NE	2087
Cressier NE	2088
Noiraigue	2103
Travers	2105
Couvet	2108
Môtiers NE	2112
Boveresse	2113
Fleurier	2114
Buttes	2115
Mont-de-Buttes	2116
La Côte-aux-Fées	2117
St-Sulpice NE	2123
Les Sagnettes	2124
Les Verrières	2126
Les Bayards	2127
Champ-du-Moulin	2149
Fretereules	2149
Brot-Dessous	2149
Les Geneveys-sur-Coffrane	2206
Coffrane	2207
Les Hauts-Geneveys	2208
La Chaux-de-Fonds	2300
La Cibourg	2300
La Sagne NE	2314
Les Ponts-de-Martel	2316
Petit-Martel	2316
Brot-Plamboz	2318
Le Crêt-du-Locle	2322
Les Planchettes	2325
La Ferrière	2333
La Cibourg	2333
Les Bois	2336
Les Emibois	2338
Muriaux	2338
Le Noirmont	2340
Les Breuleux	2345
Le Cerneux-Veusil	2345
La Chaux-des-Breuleux	2345
Saignelégier	2350
Les Pommerats	2353
Goumois	2354
Le Bémont JU	2360
Montfaucon	2362
Montfavergier	2362
Les Enfers	2363
St-Brais	2364
Le Locle	2400
Le Locle	2400
Le Prévoux	2400
La Chaux-du-Milieu	2405
La Brévine	2406
Les Taillères	2406
La Châtagne	2406
Le Brouillet	2406
Le Cerneux-Péquignot	2414
Les Brenets	2416
Biel/Bienne	2502
Biel/Bienne	2503
Biel/Bienne	2504
Biel/Bienne	2505
Tüscherz-Alfermée	2512
Twann	2513
Ligerz	2514
Prêles	2515
Lamboing	2516
Diesse	2517
Nods	2518
La Neuveville	2520
Lignières	2523
Le Landeron	2525
Macolin	2532
Evilard	2533
Orvin	2534
Les Prés-d'Orvin	2534
Frinvillier	2535
Plagne	2536
Vauffelin	2537
Romont BE	2538
Grenchen	2540
Pieterlen	2542
Lengnau BE	2543
Bettlach	2544
Selzach	2545
Orpund	2552
Safnern	2553
Meinisberg	2554
Brügg BE	2555
Scheuren	2556
Schwadernau	2556
Studen BE	2557
Aegerten	2558
Nidau	2560
Port	2562
Ipsach	2563
Bellmund	2564
Jens	2565
Sutz	2572
Mörigen	2572
Täuffelen	2575
Gerolfingen	2575
Hagneck	2575
Lüscherz	2576
Siselen BE	2577
Finsterhennen	2577
Péry	2603
La Heutte	2604
Sonceboz-Sombeval	2605
Corgémont	2606
Cortébert	2607
Courtelary	2608
Montagne-de-Courtelary	2608
St-Imier	2610
Mont-Soleil	2610
Les Pontins	2610
Mont-Crosin	2610
Cormoret	2612
Villeret	2613
Sonvilier	2615
Montagne-de-Sonvilier	2615
Renan BE	2616
La Cibourg	2616
Tavannes	2710
Le Fuet	2712
Bellelay	2713
Les Genevez JU	2714
Le Prédame	2714
Châtelat	2715
Monible	2715
Sornetan	2716
Fornet-Dessous	2717
Rebévelier	2717
Lajoux JU	2718
Fornet-Dessus	2718
Tramelan	2720
La Tanne	2720
Les Reussilles	2722
Mont-Tramelan	2723
Reconvilier	2732
Saicourt	2732
Saules BE	2732
Loveresse	2732
Pontenet	2733
Bévilard	2735
Champoz	2735
Malleray	2735
Sorvilier	2736
Court	2738
Moutier	2740
Perrefitte	2742
Eschert	2743
Belprahon	2744
Grandval	2745
Crémines	2746
Corcelles BE	2747
Seehof	2747
Souboz	2748
Les Ecorcheresses	2748
Roches BE	2762
Delémont	2800
Develier	2802
Bourrignon	2803
Soyhières	2805
Mettembert	2806
Pleigne	2807
Lucelle	2807
Movelier	2812
Ederswiler	2813
Roggenburg	2814
Courroux	2822
Courcelon	2823
Vicques	2824
Courchapoix	2825
Corban	2826
Mervelier	2827
Schelten	2827
Montsevelier	2828
Vermes	2829
Courrendlin	2830
Vellerat	2830
Rebeuvelier	2832
Rossemaison	2842
Châtillon JU	2843
Courtételle	2852
Courfaivre	2853
Bassecourt	2854
Glovelier	2855
Boécourt	2856
Montavon	2857
Undervelier	2863
Soulce	2864
Saulcy	2873
St-Ursanne	2882
St-Ursanne	2882
Montmelon	2883
Montenol	2884
Epauvillers	2885
Epiquerez	2886
Soubey	2887
Seleute	2888
Ocourt	2889
Porrentruy	2900
Fontenais	2902
Villars-sur-Fontenais	2903
Bressaucourt	2904
Courtedoux	2905
Chevenez	2906
Rocourt	2907
Grandfontaine	2908
Réclère	2912
Roche-d'Or	2912
Damvant	2914
Bure	2915
Fahy	2916
Courchavon	2922
Courtemaîche	2923
Montignez	2924
Buix	2925
Boncourt	2926
Coeuve	2932
Damphreux	2933
Lugnez	2933
Beurnevésin	2935
Alle	2942
Vendlincourt	2943
Bonfol	2944
Miécourt	2946
Charmoille	2947
Courgenay	2950
Courtemautruy	2950
Cornol	2952
Fregiécourt	2953
Pleujouse	2953
Asuel	2954
Bern	3004
Bern	3005
Bern	3006
Bern	3007
Bern	3008
Bern	3010
Bern	3011
Bern	3011
Bern	3012
Bern	3013
Bern	3014
Bern	3015
Bern	3018
Bern	3019
Bern	3020
Bern	3027
Hinterkappelen	3032
Wohlen b. Bern	3033
Murzelen	3034
Frieswil	3035
Detligen	3036
Herrenschwanden	3037
Kirchlindach	3038
Ortschwaben	3042
Uettligen	3043
Innerberg	3044
Meikirch	3045
Wahlendorf	3046
Bremgarten b. Bern	3047
Worblaufen	3048
Säriswil	3049
Zollikofen	3052
Münchenbuchsee	3053
Deisswil b. Münchenbuchsee	3053
Diemerswil	3053
Wiggiswil	3053
Lätti	3053
Schüpfen	3054
Ittigen	3063
Bolligen	3065
Stettlen	3066
Boll	3067
Utzigen	3068
Ostermundigen	3072
Gümligen	3073
Muri b. Bern	3074
Rüfenacht BE	3075
Vielbringen b. Worb	3075
Worb	3076
Enggistein	3077
Richigen	3078
Schlosswil	3082
Trimstein	3083
Wabern	3084
Zimmerwald	3086
Englisberg	3086
Niedermuhlern	3087
Rüeggisberg	3088
Oberbütschel	3088
Hinterfultigen	3089
Spiegel b. Bern	3095
Oberbalm	3096
Liebefeld	3097
Köniz	3098
Schliern b. Köniz	3098
Rüti b. Riggisberg	3099
Münsingen	3110
Tägertschi	3111
Allmendingen b. Bern	3112
Rubigen	3113
Wichtrach	3114
Gerzensee	3115
Kirchdorf BE	3116
Mühledorf BE	3116
Noflen BE	3116
Kehrsatz	3122
Belp	3123
Belpberg	3124
Toffen	3125
Kaufdorf	3126
Gelterfingen	3126
Mühlethurnen	3127
Lohnstorf	3127
Kirchenthurnen	3128
Rümligen	3128
Riggisberg	3132
Gasel	3144
Niederscherli	3145
Mittelhäusern	3147
Lanzenhäusern	3148
Schwarzenburg	3150
Mamishaus	3152
Rüschegg Gambach	3153
Rüschegg Heubach	3154
Helgisried-Rohrbach	3155
Riffenmatt	3156
Milken	3157
Guggisberg	3158
Riedstätt	3159
Niederwangen b. Bern	3172
Oberwangen b. Bern	3173
Thörishaus	3174
Flamatt	3175
Neuenegg	3176
Laupen BE	3177
Bösingen	3178
Kriechenwil	3179
Ueberstorf	3182
Albligen	3183
Wünnewil	3184
Schmitten FR	3185
Düdingen	3186
Frauenkappelen	3202
Mühleberg	3203
Rosshäusern	3204
Gümmenen	3205
Rizenbach	3206
Ferenbalm	3206
Wallenbuch	3206
Biberen	3206
Gammen	3206
Wileroltigen	3207
Golaten	3207
Gurbrü	3208
Kerzers	3210
Gurmels	3212
Kleingurmels	3212
Liebistorf	3213
Kleinbösingen	3213
Ulmiz	3214
Gempenach	3215
Büchslen	3215
Lurtigen	3215
Ried b. Kerzers	3216
Agriswil	3216
Müntschemier	3225
Treiten	3226
Ins	3232
Tschugg	3233
Vinelz	3234
Erlach	3235
Gampelen	3236
Brüttelen	3237
Gals	3238
Lyss	3250
Wengi b. Büren	3251
Ruppoldsried	3251
Worben	3252
Schnottwil	3253
Messen	3254
Balm b. Messen	3254
Rapperswil BE	3255
Dieterswil	3256
Bangerten b. Dieterswil	3256
Seewil	3256
Grossaffoltern	3257
Ammerzwil BE	3257
Suberg	3262
Büetigen	3263
Diessbach b. Büren	3264
Wiler b. Seedorf	3266
Seedorf BE	3267
Lobsigen	3268
Aarberg	3270
Radelfingen b. Aarberg	3271
Walperswil	3272
Epsach	3272
Kappelen	3273
Hermrigen	3274
Bühl b. Aarberg	3274
Merzligen	3274
Murten	3280
Meyriez	3280
Greng	3280
Bargen BE	3282
Kallnach	3283
Niederried b. Kallnach	3283
Fräschels	3284
Galmiz	3285
Muntelier	3286
Busswil BE	3292
Dotzigen	3293
Büren an der Aare	3294
Meienried	3294
Rüti b. Büren	3295
Arch	3296
Leuzigen	3297
Oberwil b. Büren	3298
Moosseedorf	3302
Jegenstorf	3303
Münchringen	3303
Zuzwil BE	3303
Ballmoos	3303
Iffwil	3305
Scheunen	3305
Etzelkofen	3306
Brunnenthal	3307
Grafenried	3308
Kernenried	3309
Zauggenried	3309
Fraubrunnen	3312
Büren zum Hof	3313
Schalunen	3314
Bätterkinden	3315
Kräiligen	3315
Limpach	3317
Mülchi	3317
Urtenen-Schönbühl	3322
Mattstetten	3322
Bäriswil BE	3323
Hindelbank	3324
Mötschwil	3324
Hettiswil b. Hindelbank	3325
Krauchthal	3326
Herzogenbuchsee	3360
Niederönz	3362
Oberönz	3363
Grasswil	3365
Seeberg	3365
Bettenhausen	3366
Bollodingen	3366
Thörigen	3367
Ochlenberg	3367
Bleienbach	3368
Wanzwil	3372
Röthenbach Herzogenbuchsee	3373
Heimenhausen	3373
Wangenried	3374
Inkwil	3375
Graben	3376
Berken	3376
Walliswil b. Wangen	3377
Wangen an der Aare	3380
Walliswil b. Niederbipp	3380
Burgdorf	3400
Heimiswil	3412
Kaltacker	3413
Oberburg	3414
Hasle b. Burgdorf	3415
Schafhausen im Emmental	3415
Rüegsauschachen	3415
Affoltern im Emmental	3416
Rüegsau	3417
Rüegsbach	3418
Biembach im Emmental	3419
Lyssach	3421
Lyssach	3421
Rüti b. Lyssach	3421
Kirchberg BE	3422
Rüdtligen	3422
Alchenflüh	3422
Ersigen	3423
Niederösch	3424
Oberösch	3424
Koppigen	3425
Willadingen	3425
Aefligen	3426
Utzenstorf	3427
Wiler b. Utzenstorf	3428
Höchstetten	3429
Hellsau	3429
Lützelflüh-Goldbach	3432
Schwanden im Emmental	3433
Obergoldbach	3434
Landiswil	3434
Ramsei	3435
Zollbrück	3436
Rüderswil	3437
Lauperswil	3438
Ranflüh	3439
Grünenmatt	3452
Heimisbach	3453
Sumiswald	3454
Grünen	3455
Trachselwald	3456
Wasen im Emmental	3457
Weier im Emmental	3462
Häusernmoos im Emmental	3463
Schmidigen-Mühleweg	3464
Dürrenroth	3465
Wynigen	3472
Rumendingen	3472
Alchenstorf	3473
Rüedisbach	3474
Riedtwil	3475
Hermiswil	3475
Oschwand	3476
Gysenstein	3503
Niederhünigen	3504
Oberhünigen	3504
Grosshöchstetten	3506
Biglen	3507
Arni BE	3508
Konolfingen	3510
Freimettigen	3510
Häutligen	3510
Walkringen	3512
Bigenthal	3513
Oberthal	3531
Zäziwil	3532
Mirchel	3532
Bowil	3533
Signau	3534
Schüpbach	3535
Aeschau	3536
Eggiwil	3537
Röthenbach im Emmental	3538
Emmenmatt	3543
Langnau im Emmental	3550
Oberfrittenbach	3551
Bärau	3552
Gohl	3553
Trubschachen	3555
Trub	3556
Fankhaus (Trub)	3557
Thun	3600
Thun	3603
Thun	3604
Thun	3608
Steffisburg	3612
Steffisburg	3613
Unterlangenegg	3614
Heimenschwand	3615
Schwarzenegg	3616
Fahrni b. Thun	3617
Süderen	3618
Eriz	3619
Innereriz	3619
Homberg b. Thun	3622
Teuffenthal b. Thun	3623
Horrenbach	3623
Buchen BE	3623
Goldiwil (Thun)	3624
Schwendibach	3624
Heiligenschwendi	3625
Hünibach	3626
Heimberg	3627
Uttigen	3628
Kiesen	3629
Oppligen	3629
Jaberg	3629
Höfen b. Thun	3631
Niederstocken	3632
Oberstocken	3632
Amsoldingen	3633
Thierachern	3634
Uebeschi	3635
Längenbühl	3636
Forst b. Längenbühl	3636
Blumenstein	3638
Pohlern	3638
Gwatt (Thun)	3645
Zwieselberg	3645
Einigen	3646
Reutigen	3647
Hilterfingen	3652
Oberhofen am Thunersee	3653
Gunten	3654
Sigriswil	3655
Tschingel ob Gunten	3656
Aeschlen ob Gunten	3656
Ringoldswil	3656
Schwanden (Sigriswil)	3657
Merligen	3658
Uetendorf	3661
Seftigen	3662
Gurzelen	3663
Burgistein	3664
Wattenwil	3665
Brenzikofen	3671
Herbligen	3671
Oberdiessbach	3672
Aeschlen b. Oberdiessbach	3672
Linden	3673
Bleiken b. Oberdiessbach	3674
Spiez	3700
Hondrich	3702
Aeschi b. Spiez	3703
Aeschiried	3703
Krattigen	3704
Faulensee	3705
Leissigen	3706
Därligen	3707
Emdthal	3711
Mülenen	3711
Reichenbach im Kandertal	3713
Frutigen	3714
Wengi b. Frutigen	3714
Adelboden	3715
Kandergrund	3716
Blausee-Mitholz	3717
Kandersteg	3718
Scharnachtal	3722
Kiental	3723
Ried (Frutigen)	3724
Achseten	3725
Wimmis	3752
Oey	3753
Diemtigen	3754
Horboden	3755
Zwischenflüh	3756
Schwenden im Diemtigtal	3757
Latterbach	3758
Erlenbach im Simmental	3762
Därstetten	3763
Weissenburg	3764
Oberwil im Simmental	3765
Boltigen	3766
Zweisimmen	3770
Blankenburg	3771
St. Stephan	3772
Matten (St. Stephan)	3773
Lenk im Simmental	3775
Oeschseite	3776
Saanenmöser	3777
Schönried	3778
Gstaad	3780
Turbach	3781
Lauenen b. Gstaad	3782
Grund b. Gstaad	3783
Feutersoey	3784
Gsteig b. Gstaad	3785
Saanen	3792
Interlaken	3800
Interlaken	3800
Unterseen	3800
Matten b. Interlaken	3800
Sundlauenen	3800
Jungfraujoch	3801
Beatenberg	3803
Habkern	3804
Goldswil b. Interlaken	3805
Bönigen b. Interlaken	3806
Iseltwald	3807
Wilderswil	3812
Saxeten	3813
Gsteigwiler	3814
Zweilütschinen	3815
Gündlischwand	3815
Lütschental	3816
Burglauenen	3816
Grindelwald	3818
Lauterbrunnen	3822
Isenfluh	3822
Wengen	3823
Kleine Scheidegg	3823
Eigergletscher	3823
Stechelberg	3824
Mürren	3825
Gimmelwald	3826
Ringgenberg BE	3852
Niederried b. Interlaken	3853
Oberried am Brienzersee	3854
Brienz BE	3855
Axalp	3855
Schwanden b. Brienz	3855
Brienzwiler	3856
Unterbach BE	3857
Hofstetten b. Brienz	3858
Meiringen	3860
Rosenlaui	3860
Schattenhalb	3860
Brünig	3860
Innertkirchen	3862
Gadmen	3863
Guttannen	3864
Brig	3900
Gamsen	3900
Brigerbad	3900
Rothwald	3901
Glis	3902
Mund	3903
Birgisch	3903
Naters	3904
Saas-Almagell	3905
Saas-Fee	3906
Simplon Dorf	3907
Gabi (Simplon)	3907
Gondo	3907
Saas-Balen	3908
Saas-Grund	3910
Ried-Brig	3911
Termen	3912
Rosswald	3913
Blatten b. Naters	3914
Belalp	3914
Ferden	3916
Kippel	3917
Goppenstein	3917
Wiler (Lötschen)	3918
Blatten (Lötschen)	3919
Zermatt	3920
Stalden VS	3922
Kalpetran	3922
Eisten	3922
Törbel	3923
St. Niklaus VS	3924
Grächen	3925
Embd	3926
Herbriggen	3927
Randa	3928
Täsch	3929
Visp	3930
Eyholz	3930
Lalden	3931
Visperterminen	3932
Staldenried	3933
Zeneggen	3934
Bürchen	3935
Baltschieder	3937
Baltschieder	3937
Ausserberg	3938
Eggerberg	3939
Steg VS	3940
Raron	3942
Niedergesteln	3942
St. German	3942
Eischoll	3943
Unterbäch VS	3944
Gampel	3945
Niedergampel	3945
Turtmann	3946
Gruben	3946
Ergisch	3947
Unterems	3948
Oberems	3948
Hohtenn	3949
Agarn	3951
Susten	3952
Leuk Stadt	3953
Inden	3953
Varen	3953
Leukerbad	3954
Albinen	3955
Guttet-Feschel	3956
Erschmatt	3957
Bratsch	3957
Sierre	3960
Sierre	3960
Corin-de-la-Crête	3960
Loc	3960
Niouc	3960
Muraz (Sierre)	3960
Vissoie	3961
St-Luc	3961
Chandolin	3961
Ayer	3961
Zinal	3961
Grimentz	3961
Mission	3961
St-Jean VS	3961
Crans-Montana	3963
Montana	3963
Aminona	3963
Chippis	3965
Chalais	3966
Réchy	3966
Vercorin	3967
Veyras	3968
Salgesch	3970
Chermignon	3971
Chermignon-d'en-Bas	3971
Ollon VS	3971
Miège	3972
Venthône	3973
Mollens VS	3974
Randogne	3975
Noës	3976
Champzabé	3976
Granges VS	3977
Flanthey	3978
Grône	3979
Bitsch	3982
Mörel	3983
Bister	3983
Filet	3983
Goppisberg	3983
Greich	3983
Fiesch	3984
Fiesch	3984
Fieschertal	3984
Münster VS	3985
Geschinen	3985
Ried-Mörel	3986
Riederalp	3987
Ulrichen	3988
Obergesteln	3988
Biel VS	3989
Ritzingen	3989
Selkingen	3989
Niederwald	3989
Blitzingen	3989
Betten	3991
Bettmeralp	3992
Grengiols	3993
Lax	3994
Martisberg	3994
Ernen	3995
Ausserbinn	3995
Mühlebach (Goms)	3995
Mühlebach (Goms)	3995
Steinhaus	3995
Steinhaus	3995
Binn	3996
Bellwald	3997
Reckingen VS	3998
Gluringen	3998
Oberwald	3999
Basel	4001
Basel	4051
Basel	4052
Basel	4052
Basel	4053
Basel	4054
Basel	4055
Basel	4056
Basel	4057
Basel	4058
Basel	4059
Bruderholz	4101
Binningen	4102
Bottmingen	4103
Oberwil BL	4104
Biel-Benken BL	4105
Therwil	4106
Ettingen	4107
Witterswil	4108
Bättwil	4112
Flüh	4112
Hofstetten SO	4114
Mariastein	4115
Metzerlen	4116
Burg im Leimental	4117
Rodersdorf	4118
Allschwil	4123
Schönenbuch	4124
Riehen	4125
Bettingen	4126
Birsfelden	4127
Muttenz	4132
Pratteln	4133
Münchenstein	4142
Dornach	4143
Arlesheim	4144
Gempen	4145
Hochwald	4146
Aesch BL	4147
Pfeffingen	4148
Reinach BL	4153
Duggingen	4202
Grellingen	4203
Himmelried	4204
Seewen SO	4206
Bretzwil	4207
Nunningen	4208
Zwingen	4222
Blauen	4223
Nenzlingen	4224
Brislach	4225
Breitenbach	4226
Büsserach	4227
Erschwil	4228
Beinwil SO	4229
Fehren	4232
Meltingen	4233
Zullwil	4234
Laufen	4242
Dittingen	4243
Röschenz	4244
Kleinlützel	4245
Wahlen b. Laufen	4246
Grindel	4247
Bärschwil	4252
Liesberg	4253
Liesberg Dorf	4254
Augst BL	4302
Kaiseraugst	4303
Giebenach	4304
Olsberg	4305
Rheinfelden	4310
Magden	4312
Möhlin	4313
Zeiningen	4314
Zuzgen	4315
Hellikon	4316
Wegenstetten	4317
Mumpf	4322
Wallbach	4323
Obermumpf	4324
Schupfart	4325
Stein AG	4332
Münchwilen AG	4333
Sisseln AG	4334
Frenkendorf	4402
Liestal	4410
Seltisberg	4411
Nuglar	4412
Büren SO	4413
Füllinsdorf	4414
Lausen	4415
Bubendorf	4416
Ziefen	4417
Reigoldswil	4418
Lupsingen	4419
St. Pantaleon	4421
Arisdorf	4422
Hersberg	4423
Arboldswil	4424
Titterten	4425
Lauwil	4426
Bennwil	4431
Lampenberg	4432
Ramlinsburg	4433
Hölstein	4434
Niederdorf	4435
Oberdorf BL	4436
Liedertswil	4436
Waldenburg	4437
Langenbruck	4438
Thürnen	4441
Diepflingen	4442
Wittinsburg	4443
Rümlingen	4444
Häfelfingen	4445
Buckten	4446
Känerkinden	4447
Läufelfingen	4448
Sissach	4450
Wintersingen	4451
Itingen	4452
Nusshof	4453
Zunzgen	4455
Tenniken	4456
Diegten	4457
Eptingen	4458
Gelterkinden	4460
Böckten	4461
Rickenbach BL	4462
Buus	4463
Maisprach	4464
Hemmiken	4465
Ormalingen	4466
Rothenfluh	4467
Kienberg	4468
Anwil	4469
Tecknau	4492
Wenslingen	4493
Oltingen	4494
Zeglingen	4495
Kilchberg BL	4496
Rünenberg	4497
Solothurn	4500
Bellach	4512
Langendorf	4513
Lommiswil	4514
Oberdorf SO	4515
Weissenstein b. Solothurn	4515
Rüttenen	4522
Niederwil SO	4523
Günsberg	4524
Balmberg	4524
Oberbalmberg	4524
Balm b. Günsberg	4525
Zuchwil	4528
Feldbrunnen	4532
Riedholz	4533
Flumenthal	4534
Hubersdorf	4535
Kammersrohr	4535
Attiswil	4536
Wiedlisbach	4537
Oberbipp	4538
Rumisberg	4539
Farnern	4539
Luterbach	4542
Deitingen	4543
Derendingen	4552
Subingen	4553
Etziken	4554
Hüniken	4554
Aeschi SO	4556
Bolken	4556
Burgäschi	4556
Steinhof SO	4556
Horriwil	4557
Hersiwil	4558
Heinrichswil	4558
Winistorf	4558
Biberist	4562
Gerlafingen	4563
Obergerlafingen	4564
Zielebach	4564
Recherswil	4565
Kriegstetten	4566
Halten	4566
Oekingen	4566
Lüterkofen	4571
Ichertswil	4571
Lohn-Ammannsegg	4573
Nennigkofen	4574
Lüsslingen	4574
Tscheppach	4576
Hessigkofen	4577
Bibern SO	4578
Gossliwil	4579
Küttigkofen	4581
Brügglen	4582
Mühledorf SO	4583
Aetigkofen	4583
Lüterswil	4584
Gächliwil	4584
Biezwil	4585
Kyburg-Buchegg	4586
Aetingen	4587
Unterramsern	4588
Brittern	4588
Oberramsern	4588
Olten	4600
Wangen b. Olten	4612
Rickenbach SO	4613
Hägendorf	4614
Allerheiligenberg	4615
Kappel SO	4616
Gunzgen	4617
Boningen	4618
Egerkingen	4622
Neuendorf	4623
Härkingen	4624
Oberbuchsiten	4625
Niederbuchsiten	4626
Wolfwil	4628
Fulenbach	4629
Trimbach	4632
Hauenstein	4633
Wisen SO	4634
Winznau	4652
Obergösgen	4653
Lostorf	4654
Stüsslingen	4655
Rohr b. Olten	4655
Starrkirch-Wil	4656
Dulliken	4657
Däniken SO	4658
Aarburg	4663
Oftringen	4665
Oensingen	4702
Kestenholz	4703
Niederbipp	4704
Wolfisberg	4704
Balsthal	4710
Laupersdorf	4712
Matzendorf	4713
Aedermannsdorf	4714
Herbetswil	4715
Welschenrohr	4716
Gänsbrunnen	4716
Mümliswil	4717
Holderbank SO	4718
Ramiswil	4719
Zofingen	4800
Strengelbach	4802
Vordemwald	4803
Brittnau	4805
Wikon	4806
Mühlethal	4812
Uerkheim	4813
Bottenwil	4814
Rothrist	4852
Murgenthal	4853
Murgenthal	4853
Riken AG	4853
Glashütten	4856
Langenthal	4900
Schwarzhäusern	4911
Aarwangen	4912
Bannwil	4913
Roggwil BE	4914
St. Urban	4915
Untersteckholz	4916
Melchnau	4917
Busswil b. Melchnau	4917
Reisiswil	4919
Bützberg	4922
Thunstetten	4922
Wynau	4923
Obersteckholz	4924
Lotzwil	4932
Gutenburg	4932
Rütschelen	4933
Madiswil	4934
Leimiswil	4935
Kleindietwil	4936
Ursenbach	4937
Rohrbach	4938
Rohrbachgraben	4938
Walterswil BE	4942
Oeschenbach	4943
Auswil	4944
Huttwil	4950
Eriswil	4952
Schwarzenbach (Huttwil)	4953
Wyssachen	4954
Gondiswil	4955
Aarau	5000
Aarau	5004
Schönenwerd	5012
Wöschnau	5012
Eppenberg	5012
Niedergösgen	5013
Gretzenbach	5014
Erlinsbach SO	5015
Barmelweid	5017
Erlinsbach	5018
Rombach	5022
Biberstein	5023
Küttigen	5024
Asp	5025
Densbüren	5026
Herznach	5027
Ueken	5028
Aarau Rohr	5032
Buchs AG	5033
Suhr	5034
Unterentfelden	5035
Oberentfelden	5036
Muhen	5037
Schöftland	5040
Hirschthal	5042
Holziken	5043
Schlossrued	5044
Schmiedrued	5046
Walde AG	5046
Staffelbach	5053
Wittwil	5053
Kirchleerau	5054
Moosleerau	5054
Attelwil	5056
Reitnau	5057
Wiliberg	5058
Oberhof	5062
Wölflinswil	5063
Wittnau	5064
Frick	5070
Oeschgen	5072
Gipf-Oberfrick	5073
Eiken	5074
Hornussen	5075
Bözen	5076
Elfingen	5077
Effingen	5078
Zeihen	5079
Laufenburg	5080
Kaisten	5082
Ittenthal	5083
Rheinsulz	5084
Sulz AG	5085
Rupperswil	5102
Wildegg	5103
Möriken AG	5103
Auenstein	5105
Veltheim AG	5106
Schinznach Dorf	5107
Oberflachs	5108
Thalheim AG	5112
Holderbank AG	5113
Schinznach Bad	5116
Brugg AG	5200
Windisch	5210
Hausen AG	5212
Villnachern	5213
Umiken	5222
Riniken	5223
Bözberg	5225
Stilli	5233
Villigen	5234
Rüfenach AG	5235
Remigen	5236
Mönthal	5237
Birr	5242
Lupfig	5242
Mülligen	5243
Birrhard	5244
Habsburg	5245
Scherz	5246
Gansingen	5272
Oberhofen AG	5273
Mettau	5274
Etzgen	5275
Wil AG	5276
Hottwil	5277
Turgi	5300
Siggenthal Station	5301
Würenlingen	5303
Endingen	5304
Unterendingen	5305
Tegerfelden	5306
Döttingen	5312
Klingnau	5313
Kleindöttingen	5314
Böttstein	5315
Leuggern	5316
Hettenschwil	5317
Mandach	5318
Koblenz	5322
Rietheim	5323
Full-Reuenthal	5324
Leibstadt	5325
Schwaderloch	5326
Bad Zurzach	5330
Rekingen AG	5332
Baldingen	5333
Böbikon	5334
Baden	5400
Baden	5404
Dättwil AG	5405
Rütihof	5406
Ennetbaden	5408
Gebenstorf	5412
Vogelsang AG	5412
Birmenstorf AG	5413
Nussbaumen AG	5415
Hertenstein AG	5415
Rieden AG	5415
Kirchdorf AG	5416
Untersiggenthal	5417
Ehrendingen	5420
Freienwil	5423
Schneisingen	5425
Lengnau AG	5426
Wettingen	5430
Neuenhof	5432
Würenlos	5436
Fislisbach	5442
Niederrohrdorf	5443
Künten	5444
Eggenwil	5445
Oberrohrdorf	5452
Remetschwil	5453
Bellikon	5454
Siglistorf	5462
Wislikofen	5463
Rümikon AG	5464
Mellikon	5465
Kaiserstuhl AG	5466
Fisibach	5467
Hunzenschwil	5502
Schafisheim	5503
Othmarsingen	5504
Brunegg	5505
Mägenwil	5506
Mellingen	5507
Wohlenschwil	5512
Tägerig	5522
Niederwil AG	5524
Nesselnbach	5524
Fischbach-Göslikon	5525
Lenzburg	5600
Ammerswil AG	5600
Staufen	5603
Hendschiken	5604
Dottikon	5605
Dintikon	5606
Hägglingen	5607
Stetten AG	5608
Wohlen AG	5610
Anglikon	5611
Villmergen	5612
Hilfikon	5613
Sarmenstorf	5614
Fahrwangen	5615
Meisterschwanden	5616
Tennwil	5617
Bettwil	5618
Büttikon AG	5619
Uezwil	5619
Bremgarten AG	5620
Zufikon	5621
Waltenschwil	5622
Boswil	5623
Bünzen	5624
Waldhäusern AG	5624
Kallern	5625
Hermetschwil-Staffeln	5626
Besenbüren	5627
Aristau	5628
Muri AG	5630
Buttwil	5632
Merenschwand	5634
Benzenschwil	5636
Beinwil (Freiamt)	5637
Geltwil	5637
Mühlau	5642
Sins	5643
Sins	5643
Alikon	5643
Meienberg	5643
Auw	5644
Aettenschwil	5645
Fenkrieden	5645
Abtwil AG	5646
Oberrüti	5647
Niederlenz	5702
Seon	5703
Egliswil	5704
Hallwil	5705
Boniswil	5706
Seengen	5707
Birrwil	5708
Beinwil am See	5712
Gränichen	5722
Teufenthal AG	5723
Dürrenäsch	5724
Leutwil	5725
Unterkulm	5726
Oberkulm	5727
Gontenschwil	5728
Zetzwil	5732
Leimbach AG	5733
Reinach AG	5734
Pfeffikon LU	5735
Burg AG	5736
Menziken	5737
Kölliken	5742
Safenwil	5745
Walterswil SO	5746
Luzern	6003
Luzern	6004
Luzern	6005
St. Niklausen LU	6005
Luzern	6006
Kriens	6010
Kriens	6010
Obernau	6012
Eigenthal	6013
Luzern	6014
Luzern	6015
Hellbühl	6016
Ruswil	6017
Buttisholz	6018
Sigigen	6019
Emmenbrücke	6020
Grosswangen	6022
Rothenburg	6023
Hildisrieden	6024
Neudorf	6025
Rain	6026
Römerswil LU	6027
Herlisberg	6028
Ebikon	6030
Emmen	6032
Buchrain	6033
Inwil	6034
Perlen	6035
Dierikon	6036
Root	6037
Gisikon	6038
Honau	6038
Root D4	6039
Dietwil	6042
Adligenswil	6043
Udligenswil	6044
Meggen	6045
Kastanienbaum	6047
Horw	6048
Hergiswil NW	6052
Alpnachstad	6053
Alpnach Dorf	6055
Kägiswil	6056
Sarnen	6060
Ramersberg	6060
Wilen (Sarnen)	6062
Stalden (Sarnen)	6063
Kerns	6064
St. Niklausen OW	6066
Melchtal	6067
Melchsee-Frutt	6068
Sachseln	6072
Flüeli-Ranft	6073
Giswil	6074
Lungern	6078
Bürglen OW	6078
Hasliberg Hohfluh	6083
Hasliberg Wasserwendi	6084
Hasliberg Goldern	6085
Hasliberg Reuti	6086
Malters	6102
Schwarzenberg LU	6103
Schachen LU	6105
Werthenstein	6106
Wolhusen	6110
Fontannen b. Wolhusen	6110
Doppleschwand	6112
Romoos	6113
Steinhuserberg	6114
Menznau	6122
Geiss	6123
Menzberg	6125
Daiwil	6126
Willisau	6130
Rohrmatt	6132
Hergiswil b. Willisau	6133
Gettnau	6142
Ohmstal	6143
Zell LU	6144
Fischbach LU	6145
Grossdietwil	6146
Altbüron	6147
Hüswil	6152
Ufhusen	6153
Hofstatt	6154
Luthern	6156
Luthern Bad	6156
Entlebuch	6162
Rengg	6162
Finsterwald b. Entlebuch	6162
Ebnet	6163
Hasle LU	6166
Bramboden	6167
Schüpfheim	6170
Flühli LU	6173
Sörenberg	6174
Escholzmatt	6182
Wiggen	6192
Marbach LU	6196
Schangnau	6197
Sempach Station	6203
Sempach	6204
Eich	6205
Neuenkirch	6206
Nottwil	6207
Oberkirch LU	6208
Sursee	6210
Buchs LU	6211
St. Erhard	6212
Kaltbach	6212
Knutwil	6213
Schenkon	6214
Beromünster	6215
Schwarzenbach LU	6215
Mauensee	6216
Kottwil	6217
Ettiswil	6218
Rickenbach LU	6221
Gunzwil	6222
Schlierbach	6231
Geuensee	6232
Büron	6233
Triengen	6234
Kulmerau	6234
Winikon	6235
Wilihof	6236
Wauwil	6242
Egolzwil	6243
Nebikon	6244
Ebersecken	6245
Altishofen	6246
Schötz	6247
Alberswil	6248
Dagmersellen	6252
Uffikon	6253
Reiden	6260
Reidermoos	6260
Hintermoos	6260
Mehlsecken	6260
Langnau b. Reiden	6262
Richenthal	6263
Pfaffnau	6264
Roggliswil	6265
Eschenbach LU	6274
Ballwil	6275
Hohenrain	6276
Kleinwangen	6277
Lieli LU	6277
Hochdorf	6280
Urswil	6280
Baldegg	6283
Gelfingen	6284
Sulz LU	6284
Hitzkirch	6285
Retschwil	6285
Altwis	6286
Aesch LU	6287
Schongau	6288
Müswangen	6289
Hämikon	6289
Hämikon	6289
Ermensee	6294
Mosen	6295
Zug	6300
Zugerberg	6300
Steinhausen	6312
Menzingen	6313
Edlibach	6313
Finstersee	6313
Unterägeri	6314
Neuägeri	6314
Oberägeri	6315
Alosen	6315
Morgarten	6315
Oberwil b. Zug	6317
Walchwil	6318
Allenwinden	6319
Cham	6330
Hünenberg	6331
Hagendorn	6332
Hünenberg See	6333
Baar	6340
Sihlbrugg	6340
Rotkreuz	6343
Buonas	6343
Risch	6343
Holzhäusern ZG	6343
Meierskappel	6344
Neuheim	6345
Weggis	6353
Vitznau	6354
Rigi Kaltbad	6356
Stansstad	6362
Obbürgen	6363
Fürigen	6363
Bürgenstock	6363
Kehrsiten	6365
Stans	6370
Oberdorf NW	6370
Ennetmoos	6372
Ennetbürgen	6373
Buochs	6374
Beckenried	6375
Emmetten	6376
Seelisberg	6377
Büren NW	6382
Dallenwil	6383
Niederrickenbach	6383
Wiesenberg	6383
Wirzweli	6383
Wolfenschiessen	6386
Oberrickenbach	6387
Grafenort	6388
Engelberg	6390
Merlischachen	6402
Küssnacht am Rigi	6403
Greppen	6404
Immensee	6405
Goldau	6410
Rigi Klösterli	6410
Rigi Staffel	6410
Rigi Kulm	6410
Rigi Scheidegg	6410
Oberarth	6414
Arth	6415
Steinerberg	6416
Sattel	6417
Rothenthurm	6418
Steinen	6422
Seewen SZ	6423
Lauerz	6424
Schwyz	6430
Rickenbach b. Schwyz	6432
Stoos SZ	6433
Illgau	6434
Muotathal	6436
Bisisthal	6436
Ried (Muotathal)	6436
Ibach	6438
Brunnen	6440
Rütli	6441
Gersau	6442
Morschach	6443
Sisikon	6452
Riemenstalden	6452
Flüelen	6454
Altdorf UR	6460
Isenthal	6461
Seedorf UR	6462
Bürglen UR	6463
Spiringen	6464
Unterschächen	6465
Bauen	6466
Schattdorf	6467
Attinghausen	6468
Haldi b. Schattdorf	6469
Erstfeld	6472
Silenen	6473
Amsteg	6474
Bristen	6475
Intschi	6476
Gurtnellen	6482
Wassen UR	6484
Meien	6485
Göschenen	6487
Andermatt	6490
Realp	6491
Hospental	6493
Bellinzona	6500
Bellinzona	6503
Giubiasco	6512
Monte Carasso	6513
Sementina	6514
Gudo	6515
Cugnasco	6516
Arbedo	6517
Gorduno	6518
Preonzo	6523
Moleno	6524
Gnosca	6525
Prosito	6526
Lodrino	6527
Camorino	6528
Castione	6532
Lumino	6533
S. Vittore	6534
S. Vittore	6534
Roveredo GR	6535
Grono	6537
Verdabbio	6538
Verdabbio	6538
Castaneda	6540
Sta. Maria in Calanca	6541
Buseno	6542
Arvigo	6543
Braggio	6544
Selma	6545
Cauco	6546
Augio	6547
Rossa	6548
Laura	6549
Leggia	6556
Cama	6557
Lostallo	6558
Soazza	6562
Mesocco	6563
S. Bernardino	6565
Indemini	6571
Quartino	6572
Magadino	6573
Vira (Gambarogno)	6574
S. Nazzaro	6575
Vairano	6575
Gerra (Gambarogno)	6576
Ranzo	6577
Caviano	6578
Piazzogna	6579
Pianezzo	6582
S. Antonio (Val Morobbia)	6583
Carena	6584
S. Antonino	6592
Cadenazzo	6593
Contone	6594
Riazzino	6595
Gordola	6596
Agarone	6597
Tenero	6598
Robasacco	6599
Locarno	6600
Locarno	6600
Muralto	6600
Solduno	6600
Locarno	6605
Mosogno	6611
Gresso	6611
Crana	6611
Ascona	6612
Porto Ronco	6613
Brissago	6614
Isole di Brissago	6614
Losone	6616
Arcegno	6618
Ronco sopra Ascona	6622
Corippo	6631
Vogorno	6632
Lavertezzo	6633
Brione (Verzasca)	6634
Gerra (Verzasca)	6635
Frasco	6636
Sonogno	6637
Orselina	6644
Brione sopra Minusio	6645
Contra	6646
Mergoscia	6647
Minusio	6648
Tegna	6652
Verscio	6653
Cavigliano	6654
Intragna	6655
Verdasio	6655
Rasa	6655
Golino	6656
Palagnedra	6657
Borgnone	6658
Camedo	6659
Moneto	6659
Loco	6661
Auressio	6661
Berzona	6661
Russo	6662
Comologno	6663
Spruga	6663
Vergeletto	6664
Avegno	6670
Gordevio	6672
Maggia	6673
Someo	6674
Riveo	6674
Cevio	6675
Bignasco	6676
Aurigeno	6677
Moghegno	6677
Giumaglio	6678
Lodano	6678
Coglio	6678
Linescio	6682
Cerentino	6683
Niva (Vallemaggia)	6683
Campo (Vallemaggia)	6684
Cimalmotto	6684
Bosco/Gurin	6685
Cavergno	6690
S. Carlo (Val Bavona)	6690
Menzonio	6692
Brontallo	6692
Broglio	6693
Prato-Sornico	6694
Peccia	6695
Piano di Peccia	6695
Fusio	6696
Claro	6702
Osogna	6703
Cresciano	6705
Iragna	6707
Biasca	6710
Malvaglia	6713
Semione	6714
Dongio	6715
Acquarossa	6716
Leontica	6716
Lottigna	6716
Dangio	6717
Torre	6717
Olivone	6718
Camperio	6718
Aquila	6719
Aquila	6719
Aquila	6719
Campo (Blenio)	6720
Ghirone	6720
Ludiano	6721
Motto (Blenio)	6721
Corzoneso	6722
Prugiasco	6723
Castro	6723
Marolta	6723
Ponto Valentino	6724
Largario	6724
Pollegio	6742
Bodio TI	6743
Personico	6744
Giornico	6745
Lavorgo	6746
Calonico	6746
Nivo	6746
Chironico	6747
Anzonico	6748
Sobrio	6749
Cavagnago	6749
Faido	6760
Molare	6760
Calpiogna	6760
Campello	6760
Carì	6760
Rossura	6760
Osco	6763
Mairengo	6763
Chiggiogna	6764
Chiggiogna	6764
Rodi-Fiesso	6772
Prato (Leventina)	6773
Dalpe	6774
Ambrì	6775
Piotta	6776
Quinto	6777
Varenzo	6777
Airolo	6780
Madrano	6780
Villa Bedretto	6781
Bedretto	6781
Rivera	6802
Camignolo	6803
Bironico	6804
Mezzovico	6805
Mezzovico	6805
Sigirino	6806
Taverne	6807
Taverne	6807
Torricella	6808
Medeglia	6809
Medeglia	6809
Isone	6810
Lamone	6814
Cadempino	6814
Melide	6815
Bissone	6816
Maroggia	6817
Melano	6818
Rovio	6821
Arogno	6822
Pugerna	6823
Capolago	6825
Capolago	6825
Riva San Vitale	6826
Brusino Arsizio	6827
Balerna	6828
Chiasso	6830
Pedrinate	6832
Seseglio	6832
Vacallo	6833
Morbio Inferiore	6834
Morbio Superiore	6835
Caneggio	6837
Bruzella	6837
Muggio	6838
Cabbio	6838
Scudellate	6838
Sagno	6839
Mendrisio	6850
Genestrerio	6852
Ligornetto	6853
S. Pietro	6854
Stabio	6855
Rancate	6862
Besazio	6863
Arzo	6864
Tremona	6865
Meride	6866
Serpiano	6867
Salorino	6872
Somazzo	6872
Corteglia	6873
Castel San Pietro	6874
Monte	6875
Casima	6875
Campora	6875
Coldrerio	6877
Novazzano	6883
Lugano	6900
Massagno	6900
Paradiso	6900
Pazzallo	6912
Carabbia	6913
Carona	6914
Pambio-Noranco	6915
Grancia	6916
Barbengo	6917
Figino	6918
Carabietta	6919
Vico Morcote	6921
Morcote	6922
Sorengo	6924
Gentilino	6925
Montagnola	6926
Agra	6927
Manno	6928
Gravesano	6929
Bedano	6930
Breganzona	6932
Muzzano	6933
Bioggio	6934
Bosco Luganese	6935
Cademario	6936
Breno	6937
Vezio	6938
Fescoggia	6938
Mugena	6939
Arosio	6939
Savosa	6942
Vezia	6943
Cureglia	6944
Origlio	6945
Ponte Capriasca	6946
Ponte Capriasca	6946
Vaglio	6947
Porza	6948
Comano	6949
Tesserete	6950
Insone	6951
Scareglia	6951
Colla	6951
Bogno	6951
Cozzo	6951
Signôra	6951
Canobbio	6952
Lugaggia	6953
Sala Capriasca	6954
Bigorio	6954
Cagiallo	6955
Oggio	6955
Oggio	6955
Lopagno	6956
Roveredo TI	6957
Bidogno	6958
Corticiasca	6958
Corticiasca	6958
Maglio di Colla	6959
Certara	6959
Curtina	6959
Cimadera	6959
Piandera Paese	6959
Piandera Paese	6959
Odogno	6960
Viganello	6962
Pregassona	6963
Cureggia	6963
Davesco-Soragno	6964
Cadro	6965
Villa Luganese	6966
Dino	6967
Sonvico	6968
Aldesago	6974
Castagnola	6976
Ruvigliana	6977
Gandria	6978
Brè sopra Lugano	6979
Castelrotto	6980
Bedigliora	6981
Bedigliora	6981
Biogno-Beride	6981
Bombinasco	6981
Banco	6981
Agno	6982
Magliaso	6983
Pura	6984
Novaggio	6986
Miglieglia	6986
Curio	6986
Caslano	6987
Ponte Tresa	6988
Purasca	6989
Cassina d'Agno	6990
Neggio	6991
Vernate	6992
Cimo	6992
Iseo	6993
Aranno	6994
Molinazzo di Monteggio	6995
Madonna del Piano	6995
Ponte Cremenaga	6996
Sessa	6997
Termine	6998
Astano	6999
Chur	7000
Felsberg	7012
Domat/Ems	7013
Trin	7014
Tamins	7015
Trin Mulin	7016
Flims Dorf	7017
Flims Waldhaus	7018
Fidaz	7019
Haldenstein	7023
Maladers	7026
Castiel	7027
Lüen	7027
Calfreisen	7027
St. Peter	7028
Pagig	7028
Peist	7029
Laax GR	7031
Laax GR 2	7032
Arosa	7050
Molinis	7056
Langwies	7057
Litzirüti	7058
Passugg	7062
Praden	7063
Tschiertschen	7064
Malix	7074
Churwalden	7075
Parpan	7076
Valbella	7077
Lenzerheide/Lai	7078
Vaz/Obervaz	7082
Lantsch/Lenz	7083
Brienz/Brinzauls GR	7084
Versam	7104
Versam	7104
Arezen	7104
Tenna	7106
Safien Platz	7107
Thalkirch	7109
Peiden	7110
Pitasch	7111
Duvin	7112
Camuns	7113
Uors (Lumnezia)	7114
Surcasti	7115
Tersnaus	7116
St. Martin (Lugnez)	7116
Valendas	7122
Carrera	7122
Castrisch	7126
Sevgein	7127
Riein	7128
Ilanz	7130
Schnaus	7130
Schnaus	7130
Vals	7132
Obersaxen	7134
Flond	7137
Surcuolm	7138
Luven	7141
Cumbel	7142
Morissen	7143
Vella	7144
Degen	7145
Vattiz	7146
Vignogn	7147
Lumbrein	7148
Surin	7148
Vrin	7149
Schluein	7151
Sagogn	7152
Falera	7153
Ruschein	7154
Ladir	7155
Ladir	7155
Rueun	7156
Pigniu	7156
Siat	7157
Waltensburg/Vuorz	7158
Andiast	7159
Tavanasa	7162
Danis	7163
Dardin	7164
Breil/Brigels	7165
Trun	7166
Zignau	7167
Schlans	7168
Rabius	7172
Surrein	7173
S. Benedetg	7174
Sumvitg	7175
Cumpadials	7176
Disentis/Mustér	7180
Cavardiras	7182
Mumpé Medel	7183
Curaglia	7184
Platta	7185
Segnas	7186
Camischolas	7187
Sedrun	7188
Rueras	7189
Says	7202
Trimmis	7203
Untervaz	7204
Zizers	7205
Igis	7206
Malans GR	7208
Seewis Dorf	7212
Seewis-Pardisla	7212
Seewis-Schmitten	7212
Valzeina	7213
Grüsch	7214
Fanas	7215
Schiers	7220
Schiers	7220
Lunden	7222
Buchen im Prättigau	7223
Putz	7224
Stels	7226
Stels	7226
Fajauna	7226
Schuders	7228
Pusserein	7228
Pragg-Jenaz	7231
Furna	7232
Jenaz	7233
Fideris	7235
Küblis	7240
Conters im Prättigau	7241
Luzein	7242
Pany	7243
Gadenstätt	7244
Ascharina	7245
St. Antönien	7246
Saas im Prättigau	7247
Serneus	7249
Klosters	7250
Klosters Dorf	7252
Davos Dorf	7260
Davos Wolfgang	7265
Davos Platz	7270
Davos Clavadel	7272
Davos Frauenkirch	7276
Davos Glaris	7277
Davos Monstein	7278
Landquart	7302
Mastrils	7303
Maienfeld	7304
Fläsch	7306
Jenins	7307
Bad Ragaz	7310
Bad Ragaz	7310
Pfäfers	7312
Pfäfers	7312
St. Margrethenberg	7313
Vadura	7314
Vättis	7315
Valens	7317
Vasön	7317
Sargans	7320
Wangs	7323
Vilters	7324
Schwendi im Weisstannental	7325
Weisstannen	7326
Bonaduz	7402
Rhäzüns	7403
Feldis/Veulden	7404
Rothenbrunnen	7405
Trans	7407
Cazis	7408
Realta	7408
Sils im Domleschg	7411
Scharans	7412
Fürstenaubruck	7413
Fürstenau	7414
Rodels	7415
Pratval	7415
Almens	7416
Paspels	7417
Tumegl/Tomils	7418
Scheid	7419
Summaprada	7421
Tartar	7422
Sarn	7423
Portein	7423
Präz	7424
Dalin	7424
Masein	7425
Flerden	7426
Flerden	7426
Urmein	7427
Tschappina	7428
Glaspass	7428
Thusis	7430
Rongellen	7430
Mutten	7431
Obermutten	7431
Zillis	7432
Donat	7433
Farden	7433
Lohn GR	7433
Mathon	7433
Wergenstein	7433
Sufers	7434
Splügen	7435
Medels im Rheinwald	7436
Nufenen	7437
Hinterrhein	7438
Andeer	7440
Clugin	7442
Pignia	7443
Ausserferrera	7444
Innerferrera	7445
Innerferrera	7445
Campsut-Cröt	7446
Cresta (Avers)	7447
Am Bach (Avers)	7447
Juf	7448
Tiefencastel	7450
Alvaschein	7451
Cunter	7452
Tinizong	7453
Rona	7454
Mulegns	7455
Sur	7456
Marmorera	7456
Bivio	7457
Mon	7458
Stierva	7459
Savognin	7460
Salouf	7462
Riom	7463
Riom	7463
Riom	7463
Parsonz	7464
Surava	7472
Alvaneu Bad	7473
Filisur	7477
Bergün/Bravuogn	7482
Preda	7482
Stugl/Stuls	7482
Latsch	7484
Alvaneu Dorf	7492
Schmitten (Albula)	7493
Davos Wiesen	7494
St. Moritz	7500
Bever	7502
Bever	7502
Samedan	7503
Pontresina	7504
Celerina/Schlarigna	7505
Champfèr	7512
Silvaplana	7513
Silvaplana-Surlej	7513
Sils/Segl Maria	7514
Fex	7514
Sils/Segl Baselgia	7515
Maloja	7516
Plaun da Lej	7517
La Punt-Chamues-ch	7522
Madulain	7523
Madulain	7523
Zuoz	7524
Zuoz	7524
S-chanf	7525
Cinuos-chel	7526
Brail	7527
Zernez	7530
Tschierv	7532
Fuldera	7533
Lü	7534
Valchava	7535
Sta. Maria Val Müstair	7536
Müstair	7537
Susch	7542
Lavin	7543
Guarda	7545
Ardez	7546
Scuol	7550
Ftan	7551
Vulpera	7552
Tarasp	7553
Sent	7554
Crusch	7554
Ramosch	7556
Ramosch	7556
Vnà	7557
Strada	7558
Tschlin	7559
Martina	7560
Samnaun-Compatsch	7562
Samnaun Dorf	7563
Casaccia	7602
Vicosoprano	7603
Borgonovo	7604
Stampa	7605
Promontogno	7606
Bondo	7606
Castasegna	7608
Soglio	7610
Ospizio Bernina	7710
Alp Grüm	7710
S. Carlo (Poschiavo)	7741
Poschiavo	7742
Sfazù	7742
La Rösa	7742
Brusio	7743
Miralago	7743
Campocologno	7744
Li Curt	7745
Le Prese	7746
Viano	7747
Campascio	7748
Zürich	8001
Zürich	8002
Zürich	8003
Zürich	8004
Zürich	8005
Zürich	8006
Zürich	8008
Zürich	8032
Zürich	8037
Zürich	8038
Zürich	8041
Zürich	8044
Gockhausen	8044
Zürich	8045
Zürich	8046
Zürich	8047
Zürich	8048
Zürich	8049
Zürich	8050
Zürich	8051
Zürich	8052
Zürich	8053
Zürich	8055
Zürich	8057
Zürich	8064
Oberengstringen	8102
Unterengstringen	8103
Weiningen ZH	8104
Regensdorf	8105
Watt	8105
Adlikon b. Regensdorf	8106
Buchs ZH	8107
Dällikon	8108
Kloster Fahr	8109
Otelfingen	8112
Boppelsen	8113
Dänikon ZH	8114
Hüttikon	8115
Fällanden	8117
Pfaffhausen	8118
Benglen	8121
Binz	8122
Ebmatingen	8123
Maur	8124
Zollikerberg	8125
Zumikon	8126
Forch	8127
Egg b. Zürich	8132
Hinteregg	8132
Esslingen	8133
Adliswil	8134
Langnau am Albis	8135
Sihlbrugg Station	8135
Sihlwald	8135
Gattikon	8136
Uitikon Waldegg	8142
Stallikon	8143
Uetliberg	8143
Glattbrugg	8152
Opfikon	8152
Glattpark (Opfikon)	8152
Rümlang	8153
Oberglatt ZH	8154
Niederhasli	8155
Nassenwil	8155
Oberhasli	8156
Dielsdorf	8157
Regensberg	8158
Steinmaur	8162
Sünikon	8162
Bachs	8164
Schöfflisdorf	8165
Oberweningen	8165
Schleinikon	8165
Niederweningen	8166
Niederglatt ZH	8172
Neerach	8173
Stadel b. Niederglatt	8174
Windlach	8175
Bülach	8180
Höri	8181
Hochfelden	8182
Bachenbülach	8184
Winkel	8185
Weiach	8187
Glattfelden	8192
Zweidlen	8192
Eglisau	8193
Hüntwangen	8194
Wasterkingen	8195
Wil ZH	8196
Rafz	8197
Schaffhausen	8200
Schaffhausen	8203
Schaffhausen	8207
Schaffhausen	8208
Neuhausen am Rheinfall	8212
Nohl	8212
Neunkirch	8213
Gächlingen	8214
Hallau	8215
Oberhallau	8216
Wilchingen	8217
Osterfingen	8218
Trasadingen	8219
Beringen	8222
Guntmadingen	8223
Löhningen	8224
Siblingen	8225
Schleitheim	8226
Beggingen	8228
Hemmental	8231
Merishausen	8232
Bargen SH	8233
Stetten SH	8234
Lohn SH	8235
Büttenhardt	8236
Opfertshofen SH	8236
Dörflingen	8239
Thayngen	8240
Barzheim	8241
Bibern SH	8242
Hofen SH	8242
Altdorf SH	8243
Feuerthalen	8245
Langwiesen	8246
Flurlingen	8247
Uhwiesen	8248
Schlatt TG	8252
Diessenhofen	8253
Willisdorf	8253
Basadingen	8254
Schlattingen	8255
Kaltenbach	8259
Etzwilen	8259
Rheinklingen	8259
Wagenhausen	8259
Stein am Rhein	8260
Hemishofen	8261
Ramsen	8262
Buch SH	8263
Eschenz	8264
Mammern	8265
Steckborn	8266
Berlingen	8267
Mannenbach-Salenstein	8268
Salenstein	8268
Fruthwilen	8269
Ermatingen	8272
Triboltingen	8273
Tägerwilen	8274
Gottlieben	8274
Kreuzlingen	8280
Kloten	8302
Bassersdorf	8303
Wallisellen	8304
Dietlikon	8305
Brüttisellen	8306
Effretikon	8307
Ottikon b. Kemptthal	8307
Illnau	8308
Agasul	8308
Nürensdorf	8309
Kemptthal	8310
Grafstal	8310
Brütten	8311
Winterberg ZH	8312
Kyburg	8314
Lindau	8315
Tagelswangen	8317
Fehraltorf	8320
Madetswil	8322
Gündisau	8322
Pfäffikon ZH	8330
Auslikon	8331
Russikon	8332
Rumlikon	8332
Hittnau	8335
Hinwil	8340
Wernetshausen	8342
Bäretswil	8344
Adetswil	8345
Elsau	8352
Ricketwil (Winterthur)	8352
Elgg	8353
Hofstetten ZH	8354
Aadorf	8355
Ettenhausen TG	8356
Guntershausen b. Aadorf	8357
Eschlikon TG	8360
Wallenwil	8360
Balterswil	8362
Bichelsee	8363
Sirnach	8370
Busswil TG	8371
Wiezikon b. Sirnach	8372
Dussnang	8374
Oberwangen TG	8374
Fischingen	8376
Au TG	8376
Winterthur	8400
Winterthur	8404
Reutlingen (Winterthur)	8404
Stadel (Winterthur)	8404
Winterthur	8405
Winterthur	8406
Winterthur	8408
Winterthur	8409
Aesch (Neftenbach)	8412
Riet (Neftenbach)	8412
Hünikon (Neftenbach)	8412
Neftenbach	8413
Buch am Irchel	8414
Berg am Irchel	8415
Gräslikon	8415
Flaach	8416
Schlatt ZH	8418
Dättlikon	8421
Pfungen	8422
Embrach	8424
Oberembrach	8425
Lufingen	8426
Freienstein	8427
Rorbas	8427
Teufen ZH	8428
Hettlingen	8442
Henggart	8444
Dachsen	8447
Andelfingen	8450
Kleinandelfingen	8451
Adlikon b. Andelfingen	8452
Alten	8453
Buchberg	8454
Rüdlingen	8455
Humlikon	8457
Dorf	8458
Volken	8459
Marthalen	8460
Oerlingen	8461
Rheinau	8462
Benken ZH	8463
Ellikon am Rhein	8464
Rudolfingen	8465
Wildensbuch	8465
Trüllikon	8466
Truttikon	8467
Waltalingen	8468
Guntalingen	8468
Rutschwil (Dägerlen)	8471
Dägerlen	8471
Oberwil (Dägerlen)	8471
Berg (Dägerlen)	8471
Bänk (Dägerlen)	8471
Seuzach	8472
Dinhard	8474
Ossingen	8475
Unterstammheim	8476
Oberstammheim	8477
Thalheim an der Thur	8478
Altikon	8479
Sennhof (Winterthur)	8482
Kollbrunn	8483
Weisslingen	8484
Neschwil	8484
Theilingen	8484
Rikon im Tösstal	8486
Zell ZH	8487
Rämismühle	8487
Turbenthal	8488
Wildberg	8489
Schalchen	8489
Ehrikon	8489
Wila	8492
Saland	8493
Bauma	8494
Schmidrüti	8495
Steg im Tösstal	8496
Fischenthal	8497
Gibswil	8498
Sternenberg	8499
Frauenfeld	8500
Gerlikon	8500
Pfyn	8505
Dettighofen	8505
Lanzenneunforn	8506
Hörhausen	8507
Homburg	8508
Thundorf	8512
Lustdorf	8512
Wetzikon TG	8512
Amlikon-Bissegg	8514
Häuslenen	8522
Aawangen	8522
Hagenbuch ZH	8523
Uesslingen	8524
Buch b. Frauenfeld	8524
Niederneunforn	8525
Wilen b. Neunforn	8525
Oberneunforn	8526
Warth	8532
Weiningen TG	8532
Herdern	8535
Hüttwilen	8536
Nussbaumen TG	8537
Uerschhausen	8537
Wiesendangen	8542
Bertschikon	8543
Gundetswil	8543
Kefikon ZH	8543
Attikon	8544
Rickenbach ZH	8545
Rickenbach Sulz	8545
Islikon	8546
Kefikon TG	8546
Menzengrüt	8546
Gachnang	8547
Ellikon an der Thur	8548
Felben-Wellhausen	8552
Harenwilen	8553
Mettendorf TG	8553
Hüttlingen	8553
Eschikofen	8553
Müllheim-Wigoltingen	8554
Bonau	8554
Müllheim Dorf	8555
Wigoltingen	8556
Engwang	8556
Illhart	8556
Lamperswil TG	8556
Raperswilen	8558
Märstetten	8560
Ottoberg	8561
Hefenhausen	8564
Engwilen	8564
Sonterswil	8564
Wäldi	8564
Lipperswil	8564
Wagerswil	8564
Hattenhausen	8564
Gunterswilen	8564
Hugelshofen	8565
Neuwilen	8566
Dotnacht	8566
Ellighausen	8566
Lippoldswilen	8566
Weinfelden	8570
Berg TG	8572
Berg TG	8572
Andhausen	8572
Graltshausen	8572
Guntershausen b. Berg	8572
Siegershausen	8573
Alterswilen	8573
Altishausen	8573
Illighausen	8574
Oberhofen TG	8574
Lengwil	8574
Lengwil	8574
Dettighofen (Lengwil)	8574
Bürglen TG	8575
Istighofen	8575
Mauren TG	8576
Schönholzerswilen	8577
Amriswil	8580
Sommeri	8580
Hagenwil b. Amriswil	8580
Hefenhofen	8580
Biessenhofen	8580
Schocherswil	8581
Dozwil	8582
Sulgen	8583
Götighofen	8583
Donzhausen	8583
Leimbach TG	8584
Opfershofen TG	8584
Mattwil	8585
Happerswil	8585
Langrickenbach	8585
Zuben	8585
Schönenbaumgarten	8585
Herrenhof	8585
Birwinken	8585
Klarsreuti	8585
Erlen	8586
Andwil TG	8586
Kümmertshausen	8586
Riedt b. Erlen	8586
Buchackern	8586
Engishofen	8586
Ennetaach	8586
Buch b. Kümmertshausen	8586
Oberaach	8587
Zihlschlacht	8588
Sitterdorf	8589
Romanshorn	8590
Uttwil	8592
Kesswil	8593
Güttingen	8594
Altnau	8595
Scherzingen	8596
Münsterlingen	8596
Landschlacht	8597
Bottighofen	8598
Salmsach	8599
Dübendorf	8600
Wangen b. Dübendorf	8602
Schwerzenbach	8603
Volketswil	8604
Gutenswil	8605
Nänikon	8606
Greifensee	8606
Aathal-Seegräben	8607
Bubikon	8608
Uster	8610
Bertschikon (Gossau ZH)	8614
Sulzbach	8614
Wermatswil	8615
Freudwil	8615
Riedikon	8616
Mönchaltorf	8617
Oetwil am See	8618
Wetzikon ZH	8620
Wetzikon ZH	8623
Grüt (Gossau ZH)	8624
Gossau ZH	8625
Ottikon (Gossau ZH)	8626
Grüningen	8627
Rüti ZH	8630
Tann	8632
Wolfhausen	8633
Hombrechtikon	8634
Dürnten	8635
Wald ZH	8636
Laupen ZH	8637
Goldingen	8638
Rapperswil SG	8640
Hurden	8640
Jona	8645
Wagen	8646
Küsnacht ZH	8700
Zollikon	8702
Erlenbach ZH	8703
Herrliberg	8704
Meilen	8706
Uetikon am See	8707
Männedorf	8708
Stäfa	8712
Uerikon	8713
Feldbach	8714
Bollingen	8715
Schmerikon	8716
Benken SG	8717
Schänis	8718
Kaltbrunn	8722
Rufi	8723
Maseltrangen	8723
Ernetschwil	8725
Gebertingen	8725
Ricken SG	8726
Walde SG	8727
Uznach	8730
Neuhaus SG	8732
Eschenbach SG	8733
Ermenswil	8734
St. Gallenkappel	8735
Rüeterswil	8735
Gommiswald	8737
Gommiswald	8737
Uetliburg SG	8738
Rieden SG	8739
Glarus	8750
Riedern	8750
Klöntal	8750
Urnerboden	8751
Näfels	8752
Mollis	8753
Netstal	8754
Ennenda	8755
Mitlödi	8756
Filzbach	8757
Obstalden	8758
Schwanden GL	8762
Schwändi b. Schwanden	8762
Sool	8762
Engi	8765
Matt	8766
Elm	8767
Nidfurn	8772
Haslen GL	8773
Leuggelbach	8774
Luchsingen	8775
Hätzingen	8775
Diesbach GL	8777
Betschwanden	8777
Rüti GL	8782
Linthal	8783
Braunwald	8784
Thalwil	8800
Kilchberg ZH	8802
Rüschlikon	8803
Au ZH	8804
Richterswil	8805
Bäch SZ	8806
Freienbach	8807
Pfäffikon SZ	8808
Horgen	8810
Horgenberg	8815
Hirzel	8816
Wädenswil	8820
Schönenberg ZH	8824
Hütten	8825
Wollerau	8832
Wollerau	8832
Wilen b. Wollerau	8832
Samstagern	8833
Schindellegi	8834
Feusisberg	8835
Bennau	8836
Einsiedeln	8840
Trachslau	8840
Gross	8841
Unteriberg	8842
Oberiberg	8843
Euthal	8844
Studen SZ	8845
Willerzell	8846
Egg SZ	8847
Alpthal	8849
Altendorf	8852
Lachen SZ	8853
Siebnen	8854
Galgenen	8854
Wangen SZ	8855
Tuggen	8856
Vorderthal	8857
Innerthal	8858
Schübelbach	8862
Buttikon SZ	8863
Reichenburg	8864
Bilten	8865
Ziegelbrücke	8866
Niederurnen	8867
Oberurnen	8868
Weesen	8872
Amden	8873
Mühlehorn	8874
Murg	8877
Quinten	8878
Walenstadt	8880
Walenstadtberg	8881
Tscherlach	8881
Unterterzen	8882
Quarten	8883
Oberterzen	8884
Mols	8885
Mädris-Vermol	8886
Mels	8887
Heiligkreuz (Mels)	8888
Plons	8889
Flums	8890
Berschis	8892
Flums Hochwiese	8893
Flumserberg Saxli	8894
Flumserberg Portels	8895
Flumserberg Bergheim	8896
Flumserberg Tannenheim	8897
Flumserberg Tannenbodenalp	8898
Urdorf	8902
Birmensdorf ZH	8903
Aesch ZH	8904
Islisberg	8905
Arni AG	8905
Bonstetten	8906
Wettswil	8907
Hedingen	8908
Zwillikon	8909
Affoltern am Albis	8910
Rifferswil	8911
Obfelden	8912
Ottenbach	8913
Aeugst am Albis	8914
Aeugstertal	8914
Hausen am Albis	8915
Jonen	8916
Oberlunkhofen	8917
Unterlunkhofen	8918
Rottenschwil	8919
Ebertswil	8925
Kappel am Albis	8926
Hauptikon	8926
Uerzlikon	8926
Mettmenstetten	8932
Maschwanden	8933
Knonau	8934
Oberrieden	8942
Fahrweid	8951
Schlieren	8952
Dietikon	8953
Geroldswil	8954
Oetwil an der Limmat	8955
Killwangen	8956
Spreitenbach	8957
Bergdietikon	8962
Rudolfstetten	8964
Berikon	8965
Oberwil-Lieli	8966
Widen	8967
St. Gallen	9000
St. Gallen	9008
St. Gallen	9010
St. Gallen	9011
St. Gallen	9012
St. Gallen	9014
St. Gallen	9015
St. Gallen	9016
Abtwil SG	9030
St. Josefen	9030
Engelburg	9032
Untereggen	9033
Eggersriet	9034
Grub AR	9035
Grub SG	9036
Speicherschwendi	9037
Rehetobel	9038
Speicher	9042
Trogen	9043
Wald AR	9044
Appenzell	9050
Appenzell Eggerstanden	9050
Appenzell Enggenhütten	9050
Appenzell Meistersrüte	9050
Appenzell Steinegg	9050
Appenzell Schlatt	9050
Niederteufen	9052
Teufen AR	9053
Haslen AI	9054
Bühler	9055
Gais	9056
Weissbad	9057
Schwende	9057
Wasserauen	9057
Brülisau	9058
Lustmühle	9062
Stein AR	9063
Hundwil	9064
Herisau	9100
Schwellbrunn	9103
Waldstatt	9104
Schönengrund	9105
Urnäsch	9107
Gonten	9108
Gontenbad	9108
Jakobsbad	9108
Schachen b. Herisau	9112
Degersheim	9113
Hoffeld	9114
Dicken	9115
Wolfertswil	9116
Mogelsberg	9122
Ebersol	9122
Nassen	9123
Brunnadern	9125
Necker	9126
St. Peterzell	9127
Gossau SG	9200
Niederwil SG	9203
Andwil SG	9204
Waldkirch	9205
Arnegg	9212
Hauptwil	9213
Kradolf	9214
Schönenberg an der Thur	9215
Buhwil	9215
Heldswil	9216
Hohentannen	9216
Neukirch an der Thur	9217
Bischofszell	9220
Schweizersholz	9223
Halden	9223
Wilen (Gottshaus)	9225
St. Pelagiberg	9225
Flawil	9230
Egg (Flawil)	9231
Uzwil	9240
Niederglatt SG	9240
Oberuzwil	9242
Jonschwil	9243
Niederuzwil	9244
Oberbüren	9245
Sonnental	9245
Niederbüren	9246
Henau	9247
Bichwil	9248
Algetshausen	9249
Niederstetten	9249
Oberstetten	9249
Wittenbach	9300
Bernhardzell	9304
Berg SG	9305
Freidorf TG	9306
Lömmenschwil	9308
Häggenschwil	9312
Muolen	9313
Steinebrunn	9314
Neukirch (Egnach)	9315
Winden	9315
Arbon	9320
Frasnacht	9320
Stachen	9320
Egnach	9322
Steinach	9323
Roggwil TG	9325
Horn	9326
Tübach	9327
Rorschach	9400
Mörschwil	9402
Goldach	9403
Rorschacherberg	9404
Wienacht-Tobel	9405
Heiden	9410
Reute AR	9411
Reute AR	9411
Schachen b. Reute	9411
Oberegg	9413
Oberegg	9413
Staad SG	9422
Altenrhein	9423
Rheineck	9424
Thal	9425
Lutzenberg	9426
Wolfhalden	9427
Walzenhausen	9428
St. Margrethen SG	9430
Au SG	9434
Heerbrugg	9435
Balgach	9436
Marbach SG	9437
Berneck	9442
Büriswilen	9442
Widnau	9443
Diepoldsau	9444
Rebstein	9445
Altstätten SG	9450
Lüchingen	9450
Kriessern	9451
Hinterforst	9452
Eichberg	9453
Montlingen	9462
Montlingen	9462
Oberriet SG	9463
Rüthi (Rheintal)	9464
Lienz	9464
Salez	9465
Sennwald	9466
Frümsen	9467
Sax	9468
Haag (Rheintal)	9469
Buchs SG	9470
Werdenberg	9470
Grabs	9472
Grabserberg	9472
Gams	9473
Sevelen	9475
Weite	9476
Fontnas	9476
Trübbach	9477
Azmoos	9478
Oberschan	9479
Malans SG	9479
Gretschins	9479
Nendeln	9485
Schaanwald	9486
Gamprin-Bendern	9487
Schellenberg	9488
Vaduz	9490
Ruggell	9491
Eschen	9492
Mauren FL	9493
Schaan	9494
Triesen	9495
Balzers	9496
Triesenberg	9497
Planken	9498
Wil SG	9500
Wil SG	9500
Braunau	9502
Stehrenberg	9503
Lanterswil	9503
Friltschen	9504
Lommis	9506
Stettfurt	9507
Weingarten-Kalthäusern	9508
Rossrüti	9512
Wuppenau	9514
Hosenruck	9515
Mettlen	9517
Züberwangen	9523
Zuzwil SG	9524
Lenggenwil	9525
Zuckenriet	9526
Niederhelfenschwil	9527
Rickenbach b. Wil	9532
Rickenbach b. Wil	9532
Kirchberg SG	9533
Dietschwil	9533
Gähwil	9534
Wilen b. Wil	9535
Schwarzenbach SG	9536
Münchwilen TG	9542
St. Margarethen TG	9543
Wängi	9545
Tuttwil	9546
Wittenwil	9547
Matzingen	9548
Bronschhofen	9552
Bettwiesen	9553
Tägerschen	9554
Tobel	9555
Affeltrangen	9556
Zezikon	9556
Märwil	9562
Buch b. Märwil	9562
Bussnang	9565
Oberbussnang	9565
Oppikon	9565
Schmidshof	9565
Rothenhausen	9565
Littenheid	9573
Lütisburg Station	9601
Bazenheid	9602
Müselbach	9602
Lütisburg	9604
Oberrindal	9604
Unterrindal	9604
Bütschwil	9606
Mosnang	9607
Ganterschwil	9608
Dreien	9612
Mühlrüti	9613
Libingen	9614
Dietfurt	9615
Lichtensteig	9620
Oberhelfenschwil	9621
Krinau	9622
Wattwil	9630
Ulisbach	9631
Hemberg	9633
Bächli (Hemberg)	9633
Ebnat-Kappel	9642
Krummenau	9643
Nesslau	9650
Ennetbühl	9651
Neu St. Johann	9652
Stein SG	9655
Alt St. Johann	9656
Unterwasser	9657
Wildhaus	9658
Bielersee	9999
Thunersee	9999
Brienzersee	9999*/