public interface Diagnosticable {
    double getTemperature();
/* TODO */
// Declare a hasFever method that reutrns true is the temperature is greater than 100.4
    default boolean hasFever(){

        return this.getTemperature()>100.4;
    }
    int getSystolic();
    int getDiastolic();
    void setTemperature(double t);
/* TODO */
// Decleare two setters. One for systolic and one for diastolic
    void setSystolic(int x);
    void setDiastolic(int x);
//Check the getters to infer the parameter types.
}
