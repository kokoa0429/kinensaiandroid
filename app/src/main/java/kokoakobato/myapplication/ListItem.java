package kokoakobato.myapplication;

/**
 * Created by kokoa on 2017/05/06.
 */

public class ListItem {

    private int ClassImageId;
    private String ClassName;
    private int KindImageId;
    private String ClassTitle;

    public int getClassImageId() {
        return ClassImageId;
    }
    public void setClassImageId(int imageId) {
        this.ClassImageId = imageId;
    }
    public String getClassName() {
        return ClassName;
    }
    public void setClassName(String text) {
        this.ClassName = text;
    }
    public int getKindImageId(){
        return KindImageId;
    }
    public void setKindImageId(int imageId){
        this.KindImageId = imageId;
    }
    public String getClassTitle() {
        return ClassTitle;
    }
    public void setClassTitle(String text) {
        this.ClassTitle = text;
    }


}