package recog.hafizco.com.recog.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.j256.ormlite.field.DatabaseField;

public class Confidences implements Parcelable{

    @DatabaseField(generatedId = true)
    int Id;
    @DatabaseField
    String Vehicle;
    @DatabaseField
    String Bicycle;
    @DatabaseField
    String Foot;
    @DatabaseField
    String Running;
    @DatabaseField
    String Still;
    @DatabaseField
    String Tilting;
    @DatabaseField
    String Walking;
    @DatabaseField
    String Unknown;
    @DatabaseField
    String Label;
    @DatabaseField
    String Date;

   public Confidences() {
        // needed by ormlite
    }

    public Confidences(int id, String vehicle, String bicycle, String foot, String running, String still, String tilting, String walking, String unknown, String label, String date) {
        Id = id;
        Vehicle = vehicle;
        Bicycle = bicycle;
        Foot = foot;
        Running = running;
        Still = still;
        Tilting = tilting;
        Walking = walking;
        Unknown = unknown;
        Label = label;
        Date = date;
    }

    public Confidences(String vehicle, String bicycle, String foot, String running, String still, String tilting, String walking, String unknown, String label, String date) {
        Vehicle = vehicle;
        Bicycle = bicycle;
        Foot = foot;
        Running = running;
        Still = still;
        Tilting = tilting;
        Walking = walking;
        Unknown = unknown;
        Label = label;
        Date = date;
    }

    protected Confidences(Parcel in) {
        Id = in.readInt();
        Vehicle = in.readString();
        Bicycle = in.readString();
        Foot = in.readString();
        Running = in.readString();
        Still = in.readString();
        Tilting = in.readString();
        Walking = in.readString();
        Unknown = in.readString();
        Label = in.readString();
        Date = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(Id);
        dest.writeString(Vehicle);
        dest.writeString(Bicycle);
        dest.writeString(Foot);
        dest.writeString(Running);
        dest.writeString(Still);
        dest.writeString(Tilting);
        dest.writeString(Walking);
        dest.writeString(Unknown);
        dest.writeString(Label);
        dest.writeString(Date);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Confidences> CREATOR = new Creator<Confidences>() {
        @Override
        public Confidences createFromParcel(Parcel in) {
            return new Confidences(in);
        }

        @Override
        public Confidences[] newArray(int size) {
            return new Confidences[size];
        }
    };

    public int getId() {
        return Id;
    }

    public String getVehicle() {
        return Vehicle;
    }

    public String getBicycle() {
        return Bicycle;
    }

    public String getFoot() {
        return Foot;
    }

    public String getRunning() {
        return Running;
    }

    public String getStill() {
        return Still;
    }

    public String getTilting() {
        return Tilting;
    }

    public String getWalking() {
        return Walking;
    }

    public String getUnknown() {
        return Unknown;
    }

    public String getLabel() {
        return Label;
    }

    public String getDate() {
        return Date;
    }

    public static Creator<Confidences> getCREATOR() {
        return CREATOR;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setVehicle(String vehicle) {
        Vehicle = vehicle;
    }

    public void setBicycle(String bicycle) {
        Bicycle = bicycle;
    }

    public void setFoot(String foot) {
        Foot = foot;
    }

    public void setRunning(String running) {
        Running = running;
    }

    public void setStill(String still) {
        Still = still;
    }

    public void setTilting(String tilting) {
        Tilting = tilting;
    }

    public void setWalking(String walking) {
        Walking = walking;
    }

    public void setUnknown(String unknown) {
        Unknown = unknown;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public void setDate(String date) {
        Date = date;
    }
}
