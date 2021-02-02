import java.util.ArrayList;
/*
Implement the class Adult Patient.
An adult patient is a Person that is Diagnosticable and that is Employable.
*/
public class AdultPatient extends Person implements Diagnosticable, Employable{
    double temperature;
    int systolic;
    int diastolic;
    ArrayList<String> jobs;

    @Override
    public double getTemperature(){
        return temperature;
    }

    @Override
    public int getSystolic(){

        return systolic;
    }

    @Override
    public int getDiastolic(){

        return diastolic;
    }

    @Override
    public void setTemperature(double temperature){

        this.temperature = temperature;
    }

    @Override
    public void setSystolic(int systolic){

        this.systolic = systolic;
    }

    @Override
    public void setDiastolic(int diastolic){

        this.diastolic = diastolic;
    }

    @Override
    public ArrayList<String> getPreviousJobs(){

        return this.jobs;
    }

    @Override
    public void addJob(String obj){
        if(this.jobs == null)
            this.jobs = new ArrayList<String>();
        this.jobs.add(obj);
    }



}

