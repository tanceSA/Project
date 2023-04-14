package com.test05.map.exer1;

import java.util.*;

/**
 * ClassName: SingerTest
 * Package: com.test05.map.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/13 上午 11:22
 * @Version 1.0
 */
public class SingerTest {
    public static void main(String[] args) {

        HashMap singers = new HashMap();

        String singer1 = "周杰倫";

        ArrayList singer1Songs = new ArrayList();
        singer1Songs.add("夜曲");
        singer1Songs.add("一路向北");
        singer1Songs.add("安靜");
        singer1Songs.add("晴天");

        singers.put(singer1, singer1Songs);

        String singer2 = "陳奕迅";

        ArrayList singer2Songs = new ArrayList();
        singer2Songs.add("十年");
        singer2Songs.add("淘汰");
        singer2Songs.add("K歌之王");
        singer2Songs.add("浮誇");

        singers.put(singer2, singer2Songs);

        String singer3 = "林俊傑";

        ArrayList singe3Songs = new ArrayList();
        singe3Songs.add("江南");
        singe3Songs.add("曹操");
        singe3Songs.add("豆漿油條");
        singe3Songs.add("編號89757");

        singers.put(singer3, singe3Songs);

        Set entrySet = singers.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry enrty =  (Map.Entry)it.next();
            System.out.println("歌手: "+enrty.getKey());
            System.out.println("歌曲有: "+enrty.getValue());
        }
    }
}
