package com.test09._enum;

/**
 * ClassName: SeasonTest1
 * Package: com.test09._enum
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/20 上午 09:25
 * @Version 1.0
 */
public class SeasonTest1 {
    public static void main(String[] args) {

        //1. toSring()
        System.out.println("1. toString()");
        System.out.println(Season1.SPRING.toString());
        System.out.println();

        //2. name()
        System.out.println("2. name()");
        System.out.println(Season1.SUMMER.name());
        System.out.println();

        //3. values()
        System.out.println("3. values()");
        Season1[] values = Season1.values();
        for (Season1 s:values
             ) {
            System.out.println(s);
        }
        System.out.println(

        );

        //4. valueOf(String name)
        System.out.println("4. valueOf(String name)");
        System.out.println(Season1.valueOf("AUTUMN"));
        System.out.println();

        //5. ordinal()
        System.out.println("5. ordinal()");
        Season1.WINTER.ordinal();
        System.out.println();

        Season2.SPRING.info();

    }
}
interface Info{
    void info();
}
//jdk5.0之後使用Enum關鍵字
enum Season1 implements Info{
    //1.必須在枚舉類別的開頭宣告多個對象，使用逗號隔開
    SPRING("春天","1"),
    SUMMER("夏天","2"),
    AUTUMN("秋天","3"),
    WINTER("冬天","4");

    //2
    private final String SEASONNAME;
    private final String SEASONDESC;

    //3
    private  Season1(String SEASONNAME, String SEASONDESC) {

        this.SEASONNAME = SEASONNAME;
        this.SEASONDESC = SEASONDESC;
    }

    //4
    public String getSEASONNAME() {
        return SEASONNAME;
    }

    public String getSEASONDESC() {
        return SEASONDESC;
    }

    @Override
    public void info() {

    }
}

enum Season2 implements Info{
    SPRING("春天","1") {
        @Override
        public void info() {

        }
    },
    SUMMER("夏天","2") {
        @Override
        public void info() {

        }
    },
    AUTUMN("秋天","3"){
        @Override
        public void info() {

        }
    },
    WINTER("冬天","4") {
        @Override
        public void info() {

        }
    };

    //2
    private final String SEASONNAME;
    private final String SEASONDESC;

    //3
    private  Season2(String SEASONNAME, String SEASONDESC) {

        this.SEASONNAME = SEASONNAME;
        this.SEASONDESC = SEASONDESC;
    }

    //4
    public String getSEASONNAME() {
        return SEASONNAME;
    }

    public String getSEASONDESC() {
        return SEASONDESC;
    }
}