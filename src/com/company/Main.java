package com.company;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String s = "<input type=\"hidden\" name=\"mapCoordinate\" title=\"14\" value=\"36.991071|35.339769\" nsil=\"Adana\" nsname=\"Optimum AVM\" nsaddress=\"<p>Hacı Sabancı Bulvarı No: 28 Y&amp;uuml;reğir</p>\" nsdistrict=\"Yüreğir\" nscity=\"Adana\" nstype=\"normal\" nsimage=\"Koctas-Adana_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"49\" value=\"37.018887|35.243359\" nsil=\"Adana\" nsname=\"Koçtaş Adana - M1 AVM\" nsaddress=\"<p>M1 Merkez Adana AVM Yeni Mh. &amp;Ouml;ğretmenler Bulvarı No:15 /1</p>&#10;<p>Seyhan - Adana</p>\" nsdistrict=\"Seyhan\" nscity=\"Adana\" nstype=\"normal\" nsimage=\"002_Adana-M1AVM.JPG\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"1\" value=\"39.875508|32.869584\" nsil=\"Ankara\" nsname=\"Koçtaş Ankara - Çankaya\" nsaddress=\"<p>365 AVM &amp;Ccedil;ankaya Yıldız Kav. 38. Sok.</p>\" nsdistrict=\"Yıldız\" nscity=\"Ankara\" nstype=\"normal\" nsimage=\"Koctas-Ankara-Cankaya_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"3\" value=\"39.95227|32.830716\" nsil=\"Ankara\" nsname=\"Koçtaş Ankara - Ankamall\" nsaddress=\"<p>Gazi Mah. No:2 Ankamall AVM Yanı</p>\" nsdistrict=\"Akkopru \" nscity=\"Ankara\" nstype=\"normal\" nsimage=\"Koctas-Ankara-Ankamall_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"9\" value=\"39.965746|32.640385\" nsil=\"Ankara\" nsname=\"Koçtaş Ankara - Eryaman\" nsaddress=\"<p>Eryaman 1. Etap, Altay Mah. Ayaş Yolu</p>\" nsdistrict=\"Etimesgut\" nscity=\"Ankara\" nstype=\"normal\" nsimage=\"Koctas-Ankara-Eryaman_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"11\" value=\"39.900345|32.691264\" nsil=\"Ankara\" nsname=\"Koçtaş Ankara - Gordion AVM\" nsaddress=\"<p>Ankaralılar Cad. Gordion AVM No: 2</p>\" nsdistrict=\"Yenimahalle\" nscity=\"Ankara\" nstype=\"normal\" nsimage=\"Koctas-Ankara-Gordion-AVM_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"8\" value=\"36.910327|30.677768\" nsil=\"Antalya\" nsname=\"Koçtaş Antalya - Dokuma\" nsaddress=\"<p>&amp;Ouml;zdilek Park AVM, N. Kemal Bul. No: 10</p>\" nsdistrict=\"Dokuma\" nscity=\"Antalya\" nstype=\"normal\" nsimage=\"Koctas-Antalya-Dokuma_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"16\" value=\"36.536313|32.04492\" nsil=\"Antalya\" nsname=\"Koçtaş Alanya\" nsaddress=\"<p>Babaoğlu Mah. Eskigazi Cad. No: 46/1</p>\" nsdistrict=\"Alanya\" nscity=\"Antalya\" nstype=\"normal\" nsimage=\"Koctas-Alanya_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"35\" value=\"36.889008|30.744377\" nsil=\"Antalya\" nsname=\"Koçtaş Antalya - Topçular\" nsaddress=\"<p>Aspendos Bul. No: 112</p>\" nsdistrict=\"Topçular\" nscity=\"Antalya\" nstype=\"normal\" nsimage=\"Koctas-Antalya-Topcular_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"23\" value=\"37.847864|27.258732\" nsil=\"Aydin\" nsname=\"Koçtaş Kuşadası\" nsaddress=\"<p>Kadınlar Denizi Mah. S. Demirel Bul.</p>\" nsdistrict=\"Kuşadası\" nscity=\"Aydın\" nstype=\"normal\" nsimage=\"Koctas-Kusadasi_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"19\" value=\"39.59829|26.976145\" nsil=\"Balikesir\" nsname=\"Koçtaş Edremit\" nsaddress=\"<p>Kurudere Mevkii &amp;Ccedil;anakkale Yolu 4. km</p>\" nsdistrict=\"Edremit\" nscity=\"Balıkesir\" nstype=\"normal\" nsimage=\"Koctas-Edremit_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"29\" value=\"40.249989|28.960241\" nsil=\"Bursa\" nsname=\"Koçtaş Bursa - Korupark AVM\" nsaddress=\"<p>Mudanya Yolu 9. km Korupark AVM</p>\" nsdistrict=\"Emek\" nscity=\"Bursa\" nstype=\"normal\" nsimage=\"Koctas-Bursa-Korupark-AVM_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"31\" value=\"40.209661|28.994169\" nsil=\"Bursa\" nsname=\"Koçtaş Bursa - Nilüfer Carrefour AVM\" nsaddress=\"<p>Odunluk Mah. İzmir Yolu Cad. No: 55</p>\" nsdistrict=\"Nilüfer\" nscity=\"Bursa\" nstype=\"normal\" nsimage=\"Koctas-Bursa-Niluefer-Carrefour-AVM_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"57\" value=\"40.267880|29.054651\" nsil=\"Bursa\" nsname=\"Koçtaş Bursa - Anatolium\" nsaddress=\"<p>Alaşar Mah. Yeni Yalova Cad. No:487, Demirtas / Bursa</p>\" nsdistrict=\"Demirtaş\" nscity=\"Bursa\" nstype=\"normal\" nsimage=\"\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"7\" value=\"37.806301|29.109745\" nsil=\"Denizli\" nsname=\"Koçtaş Denizli\" nsaddress=\"<p>Ankara asfaltı 5. km Sevindik Kavşağı</p>\" nsdistrict=\"\" nscity=\"Denizli\" nstype=\"normal\" nsimage=\"Koctas-Denizli_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"60\" value=\"37.959784|40.181857\" nsil=\"Diyarbakir\" nsname=\"Koçtaş Diyarbakır\" nsaddress=\"<p>Fabrika Mahallesi ,Elazığ Bulvarı Forum AVM No:155 / 24 Yenişehir / Diyarbakır</p>\" nsdistrict=\"Yenişehir\" nscity=\"Diyarbakır\" nstype=\"normal\" nsimage=\"\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"20\" value=\"39.781088|30.488518\" nsil=\"Eskisehir\" nsname=\"Koçtaş Eskişehir\" nsaddress=\"<p>Ertuğrulgazi Mah. Arzug&amp;uuml;l Sok. No: 30</p>\" nsdistrict=\"Tepebaşı\" nscity=\"Eskişehir\" nstype=\"normal\" nsimage=\"Koctas-Eskisehir_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"45\" value=\"37.069886|37.380915\" nsil=\"Gaziantep\" nsname=\"Koçtaş Gaziantep\" nsaddress=\"<p>Yaprak Mahallesi, İstasyon Cad. No: 76&amp;nbsp; Forum AVM</p>\" nsdistrict=\"Şehitkamil\" nscity=\"Gaziantep\" nstype=\"normal\" nsimage=\"Koctas-Gaziantep_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"5\" value=\"41.007973|28.656431\" nsil=\"Istanbul\" nsname=\"Koçtaş İstanbul - Beylikdüzü\" nsaddress=\"<p>Barış Mah. E5 Yan Yol, Sakarya Cad. No:1</p>\" nsdistrict=\"Beylikdüzü\" nscity=\"İstanbul\" nstype=\"normal\" nsimage=\"Koctas-Istanbul-Beylikduezue_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"12\" value=\"40.892295|29.17345\" nsil=\"Istanbul\" nsname=\"Koçtaş İstanbul - Kartal\" nsaddress=\"<p>Turgut &amp;Ouml;zal Bul. Kartal Sahil Yolu</p>\" nsdistrict=\"Kartal\" nscity=\"İstanbul\" nstype=\"normal\" nsimage=\"Koctas-Istanbul-Kartal_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"17\" value=\"41.056249|28.667514\" nsil=\"Istanbul\" nsname=\"Koçtaş İstanbul - Akbatı AVM\" nsaddress=\"<p>Akbatı AVM Atat&amp;uuml;rk Bul. Esenkent Mevkii</p>\" nsdistrict=\"Bahçeşehir\" nscity=\"İstanbul\" nstype=\"normal\" nsimage=\"020_Istanbul-Akbati.JPG\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"32\" value=\"40.989006|29.085757\" nsil=\"Istanbul\" nsname=\"Koçtaş İstanbul - Göztepe\" nsaddress=\"<p>Optimum Outlet, İstiklal Sok. No: 10/4</p>\" nsdistrict=\"Göztepe\" nscity=\"İstanbul\" nstype=\"normal\" nsimage=\"Koctas-Istanbul-Goeztepe_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"34\" value=\"41.062402|28.992879\" nsil=\"Istanbul\" nsname=\"Koçtaş İstanbul - Şişli\" nsaddress=\"<p>Cevahir AVM B&amp;uuml;y&amp;uuml;kdere Cad. No:22</p>\" nsdistrict=\"Şişli\" nscity=\"İstanbul\" nstype=\"normal\" nsimage=\"Koctas-Istanbul-Sisli_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"36\" value=\"40.993652|28.833736\" nsil=\"Istanbul\" nsname=\"Koçtaş İstanbul - Yenibosna\" nsaddress=\"<p>Fevzi &amp;Ccedil;akmak Mah. Yıldırım Beyazıd Cad.</p>\" nsdistrict=\"Yenibosna\" nscity=\"İstanbul\" nstype=\"normal\" nsimage=\"Koctas-Istanbul-Yenibosna_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"38\" value=\"40.982387|29.132223\" nsil=\"Istanbul\" nsname=\"Koçtaş İstanbul - Ataşehir Brandium AVM\" nsaddress=\"<p>Dereboyu Cad. No:29 Brandium AVM Ataşehir</p>\" nsdistrict=\"Ataşehir\" nscity=\"İstanbul\" nstype=\"normal\" nsimage=\"021_Istanbul-Atasehir_Brandium.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"41\" value=\"41.07438055555556|28.923405555555554\" nsil=\"Istanbul\" nsname=\"Koçtaş İstanbul - Vialand AVM\" nsaddress=\"<p>Yeşilpınar Mahallesi Girne Caddesi</p>\" nsdistrict=\"Eyüp\" nscity=\"İstanbul\" nstype=\"normal\" nsimage=\"Koctas-Istanbul-Vialand_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"42\" value=\"41.115953|29.050023\" nsil=\"Istanbul\" nsname=\"Koçtaş Fix İstinye\" nsaddress=\"<p>İstinye Mahallesi Sarıyer Caddesi No: 69</p>\" nsdistrict=\"Sarıyer\" nscity=\"İstanbul\" nstype=\"fix\" nsimage=\"\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"43\" value=\"41.031475|29.229697\" nsil=\"Istanbul\" nsname=\"Koçtaş Fix Taşdelen\" nsaddress=\"<p>Turgut &amp;Ouml;zal Bulvarı no:149 Taşdelen / &amp;Ccedil;ekmek&amp;ouml;y</p>\" nsdistrict=\"Çekmeköy\" nscity=\"İstanbul\" nstype=\"fix\" nsimage=\"\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"44\" value=\"40.934097|29.21475\" nsil=\"Istanbul\" nsname=\"Koçtaş Fix Uğur Mumcu\" nsaddress=\"<p>Uğur Mumcu Merkez Soğanlık Mah. Şeyh Şamil Cad. No:9 F Blok Kartal</p>\" nsdistrict=\"Kartal\" nscity=\"İstanbul\" nstype=\"fix\" nsimage=\"\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"47\" value=\"41.053301|29.022617\" nsil=\"Istanbul\" nsname=\"Koçtaş Fix Ortaköy\" nsaddress=\"<p>Mecidiye Mah. Dereboyu Cad. Mehmet Karaca Sok. No: 2</p>\" nsdistrict=\"Beşiktaş\" nscity=\"İstanbul\" nstype=\"fix\" nsimage=\"\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"48\" value=\"41.045234|28.897044\" nsil=\"Istanbul\" nsname=\"Koçtaş İstanbul - Bayrampaşa\" nsaddress=\"<p>Kocatepe Mahallesi Paşa Caddesi S S Blok No:3 <br />Forum İstanbul AVM / Bayrampaşa <br />08502503900</p>\" nsdistrict=\"Bayrampaşa\" nscity=\"İstanbul\" nstype=\"normal\" nsimage=\"023_Istanbul-Bayrampasa.JPG\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"50\" value=\"40.950220|29.104085\" nsil=\"Istanbul\" nsname=\"Koçtaş Küçükyalı Fix \" nsaddress=\"<p>Altıntepe Mah. Bağdat Cad. No:84/B</p>\" nsdistrict=\"Maltepe\" nscity=\"İstanbul\" nstype=\"fix\" nsimage=\"\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"51\" value=\"41.063054|28.807214\" nsil=\"Istanbul\" nsname=\"Koçtaş Başakşehir - MOI\" nsaddress=\"<p>Ziya G&amp;ouml;kalp Mah. S&amp;uuml;leyman Demirel Bulvarı No:7 GBlok 1B/20 Mall Of İstanbul AVM</p>&#10;<p>İkitelli Başakşehir /İstanbul</p>\" nsdistrict=\"Başakşehir\" nscity=\"İstanbul\" nstype=\"normal\" nsimage=\"022_Istanbul-Basaksehir_MOI.JPG\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"56\" value=\"40.930285|29.128696\" nsil=\"Istanbul\" nsname=\"Koçtaş Fix Maltepe\" nsaddress=\"<p>Feyzullah mah. Bağdat cad. No:304A Maltepe / İstanbul</p>\" nsdistrict=\"Maltepe\" nscity=\"İstanbul\" nstype=\"fix\" nsimage=\"\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"61\" value=\"40.975276|29.121545\" nsil=\"Istanbul\" nsname=\"Koçtaş Fix Kayışdağ\" nsaddress=\"<p>İ&amp;ccedil;erenk&amp;ouml;y Mahallesi Prof. Necmettin Erbakan Caddesi Cami Sokak No:9 Ataşehir/İstanbul</p>\" nsdistrict=\"Ataşehir\" nscity=\"İstanbul\" nstype=\"fix\" nsimage=\"\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"69\" value=\"40.9806061|29.0724984\" nsil=\"Istanbul\" nsname=\"Koçtaş Fix Göztepe\" nsaddress=\"<p>Fahrettin Kerim G&amp;ouml;kay Caddesi no:242 G&amp;ouml;ztepe-Kadik&amp;ouml;y</p>\" nsdistrict=\"Göztepe\" nscity=\"İstanbul\" nstype=\"fix\" nsimage=\"\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"70\" value=\"41.01233|29.05346\" nsil=\"Istanbul\" nsname=\"Koçtaş Fix Acıbadem\" nsaddress=\"<p>Acıbadem Caddesi No:208/2</p>\" nsdistrict=\"Acıbadem\" nscity=\"İstanbul\" nstype=\"fix\" nsimage=\"\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"71\" value=\"41.0607286|28.685253\" nsil=\"Istanbul\" nsname=\"Koçtaş Fix Bahçeşehir\" nsaddress=\"<p>Bah&amp;ccedil;eşehir 2.kısım Mah. Migros pk:34538 Bah&amp;ccedil;eşehir</p>\" nsdistrict=\"Bahçeşehir\" nscity=\"İstanbul\" nstype=\"fix\" nsimage=\"\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"72\" value=\"40.9723559|29.0740213\" nsil=\"Istanbul\" nsname=\"Koçtaş Fix Ethem Efendi\" nsaddress=\"<p>Erenk&amp;ouml;y Mah. Ethem Efendi Cad No:52/A Kadık&amp;ouml;y</p>\" nsdistrict=\"Ethemefendi\" nscity=\"İstanbul\" nstype=\"fix\" nsimage=\"\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"4\" value=\"38.394958|27.04646\" nsil=\"Izmir\" nsname=\"Koçtaş İzmir - Balçova \" nsaddress=\"<p>Mithatpaşa Cad. No:40</p>\" nsdistrict=\"Balçova\" nscity=\"İzmir\" nstype=\"normal\" nsimage=\"Koctas-Izmir-Balcova_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"6\" value=\"38.446725|27.184729\" nsil=\"Izmir\" nsname=\"Koçtaş İzmir - Bornova\" nsaddress=\"<p>3. Sanayi Sitesi 296 Sok. No: 1/B</p>\" nsdistrict=\"Bornova\" nscity=\"İzmir\" nstype=\"normal\" nsimage=\"Koctas-Izmir-Bornova_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"30\" value=\"38.477912|27.066792\" nsil=\"Izmir\" nsname=\"Koçtaş İzmir - Mavişehir\" nsaddress=\"<p>Cahar Dudayev Bul. No: 7/101</p>\" nsdistrict=\"Çiğli\" nscity=\"İzmir\" nstype=\"normal\" nsimage=\"Koctas-Izmir-Mavisehir_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"37\" value=\"38.338989|27.134425\" nsil=\"Izmir\" nsname=\"Koçtaş İzmir - Gaziemir Optimum AVM\" nsaddress=\"<p>İzmir Optimum Outlet AVM, Ak&amp;ccedil;ay Cad. No:101 Gaziemir - İzmir</p>\" nsdistrict=\"Gaziemir\" nscity=\"İzmir\" nstype=\"normal\" nsimage=\"032_Izmir-Gaziemir.JPG\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"39\" value=\"37.571458|36.921718\" nsil=\"Kahramanmaras\" nsname=\"Koçtaş Kahramanmaraş\" nsaddress=\"<p>Şazibey Mahallesi Haydar Aliyev Bulvarı No: 3 B 110&amp;nbsp;Piazza AVM</p>\" nsdistrict=\"Merkez\" nscity=\"Kahramanmaraş\" nstype=\"normal\" nsimage=\"Koctas-Piazza-AVM_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"13\" value=\"38.722778|35.497405\" nsil=\"Kayseri\" nsname=\"Koçtaş Kayseri - Forum AVM\" nsaddress=\"<p>Forum Kayseri AVM, Yanıloğlu Mah.</p>\" nsdistrict=\"Melikgazi\" nscity=\"Kayseri\" nstype=\"normal\" nsimage=\"Koctas-Kayseri-Forum-AVM_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"26\" value=\"38.740459|35.540973\" nsil=\"Kayseri\" nsname=\"Koçtaş Kayseri - Optimall AVM\" nsaddress=\"<p>Sivas Cad. No: 228 Konaklar Mevkii</p>\" nsdistrict=\"Melikgazi\" nscity=\"Kayseri\" nstype=\"normal\" nsimage=\"Koctas-Kayseri-Optimall-AVM_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"21\" value=\"40.795529|29.442007\" nsil=\"Kocaeli\" nsname=\"Koçtaş Gebze\" nsaddress=\"<p>Gebze Center E-5 T&amp;uuml;bitak Kav.</p>\" nsdistrict=\"Gebze\" nscity=\"Kocaeli\" nstype=\"normal\" nsimage=\"Koctas-Gebze_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"22\" value=\"40.751077|29.950372\" nsil=\"Kocaeli\" nsname=\"Koçtaş İzmit\" nsaddress=\"<p>Sefa Sirmen Bul. Outlet Center Karşısı</p>\" nsdistrict=\"İzmit\" nscity=\"Kocaeli\" nstype=\"normal\" nsimage=\"Koctas-Izmit_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"53\" value=\"40.759478|29.977815\" nsil=\"Kocaeli\" nsname=\"Koçtaş İzmit Yahya Kaptan\" nsaddress=\"<p>Ovacık Mahallesi D-100 Karayolu &amp;uuml;zeri No:28 Başiskele / Kocaeli</p>\" nsdistrict=\"İzmit\" nscity=\"Kocaeli\" nstype=\"normal\" nsimage=\"044_Kocaeli_Yahyakaptan.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"28\" value=\"37.894898|32.476667\" nsil=\"Konya\" nsname=\"Koçtaş Konya\" nsaddress=\"<p>Akıncılar Mah. Sille Cad. No: 2/A</p>\" nsdistrict=\"Selçuklu\" nscity=\"Konya\" nstype=\"normal\" nsimage=\"Koctas-Konya_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"24\" value=\"38.349679|38.296762\" nsil=\"Malatya\" nsname=\"Koçtaş Malatya\" nsaddress=\"<p>Malatya Park AVM İn&amp;ouml;n&amp;uuml; Mah &amp;Ccedil;amlıca Cad. No: 178</p>\" nsdistrict=\"\" nscity=\"Malatya\" nstype=\"normal\" nsimage=\"Koctas-Malatya_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"25\" value=\"36.785307|34.588341\" nsil=\"Mersin\" nsname=\"Koçtaş Mersin\" nsaddress=\"<p>Forum AVM G&amp;uuml;venevler Mah. 1. Cad.</p>\" nsdistrict=\"Yenişehir\" nscity=\"Mersin\" nstype=\"normal\" nsimage=\"Koctas-Mersin_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"18\" value=\"37.056716|27.373595\" nsil=\"Mugla\" nsname=\"Koçtaş Bodrum\" nsaddress=\"<p>Merkez Mah. Atat&amp;uuml;rk Bul. No: 210/C</p>&#10;<p>Konacık/Bodrum/Muğla</p>\" nsdistrict=\"Bodrum\" nscity=\"Muğla\" nstype=\"normal\" nsimage=\"Koctas-Bodrum_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"15\" value=\"40.778153|30.364816\" nsil=\"Sakarya\" nsname=\"Koçtaş Adapazarı\" nsaddress=\"<p>Serdivan AVM Arabacıalanı Mah. Mert Sokak No: 25-39<br />08.07.2013 - 31.07.2013 tarihleri arasında<br />Mağaza a&amp;ccedil;ılış kapanış saatleri 11:00 - 23:00</p>\" nsdistrict=\"Serdivan\" nscity=\"Sakarya\" nstype=\"normal\" nsimage=\"Koctas-Adapazari_large.jpg\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"59\" value=\"41.263541|36.349741\" nsil=\"Samsun\" nsname=\"Koçtaş Samsun\" nsaddress=\"<p>Soğuksu Mahallesi,404.Sokak No:4 A &amp;nbsp;Canik / Samsun</p>\" nsdistrict=\"Canik\" nscity=\"Samsun\" nstype=\"normal\" nsimage=\"\"/>\n" +
                "<input type=\"hidden\" name=\"mapCoordinate\" title=\"27\" value=\"41.000206|39.762281\" nsil=\"Trabzon\" nsname=\"Koçtaş Trabzon\" nsaddress=\"<p>Forum AVM No: 2 &amp;Ccedil;&amp;ouml;mlek&amp;ccedil;i Mah.</p>\" nsdistrict=\"\" nscity=\"Trabzon\" nstype=\"normal\" nsimage=\"043_Trabzon.jpg\"/>q";


int i=0;
int k=1;
            String filename = "nnnnnn.xls" ;
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("FirstSheet");

            HSSFRow rowhead = sheet.createRow((short)0);

            rowhead.createCell(1).setCellValue("Latitude");
            rowhead.createCell(2).setCellValue("Longtitude");

        rowhead.createCell(3).setCellValue("Location");

int g=1;
            while(s.charAt(i)!='q'){





   // System.out.print("i="+i);
    while(s.charAt(i)=='v'&&s.charAt(i+1)=='a'&&s.charAt(i+2)=='l'){

        k++;
        String a="";
        String b="";

        int n=0;
        i=i+7;
        System.out.print("\nlat=");
        while(s.charAt(i)!='|') {
            a=a+s.charAt(i);
          //  System.out.print(    s.charAt(i));
            i++;
        }
i++; System.out.print(a);
       // row.createCell(1).setCellValue(a);

        System.out.print(" lNG=");
        while(s.charAt(i)!='"') {
            b=b+s.charAt(i);
      //      System.out.print(    s.charAt(i));
            i++;
        }
        System.out.print(b);
      //  row.createCell(2).setCellValue(b);






    }
i++;


    while(s.charAt(i)=='n'&&s.charAt(i+1)=='s'&&s.charAt(i+2)=='n'){
        String c="";
        i=i+8;
        System.out.print(" loc=");
        while(s.charAt(i)!='"') {
            c=c+s.charAt(i);
         //   System.out.print(    s.charAt(i));
            i++;
        }
        i++;
        System.out.print(c);    HSSFRow row = sheet.createRow((short)k);
                row.createCell(3).setCellValue(c);

    }

   // i++;




}

        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Your excel file has been generated!");



    }
}
