package kokoakobato.myapplication;

/**
 * Created by kokoa on 2017/05/06.
 */

class MyList {

    public static final String[] Data = {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
            "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    };


    public static String[] Data(int anInt) {

        switch (anInt){
            case 1:
                return new String[]{"2A", "2B", "2C", "2D", "2E", "2F", "2G", "2H", "2I", "2J"};
            case 2:
                return new String[]{"3A", "3B", "3C", "3D","3E", "3F", "3G", "3H", "3I", "3J"};
            case 3:
                return new String[]{"1A", "1B", "1C", "1D", "1E", "1F", "1G", "1H", "1I", "1J", "1K"};
            case 4:
                return new String[]{"2A", "2B", "2C", "2D", "2E", "2F", "2G", "2H", "2I", "2J", "2K"};
        }


        return null;

    }
}
