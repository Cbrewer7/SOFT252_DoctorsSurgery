/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocSurgeryManagement;

/**
 *
 * @author C-bre
 */
public class DoctorFeedback {
    private String DoctorID;
    private String PatientID;
    private String feedbackNotes;
    private int rating;

    /**
     * @return the DoctorID
     */
    public String getDoctorID() {
        return DoctorID;
    }

    /**
     * @param DoctorID the DoctorID to set
     */
    public void setDoctorID(String DoctorID) {
        this.DoctorID = DoctorID;
    }

    /**
     * @return the PatientID
     */
    public String getPatientID() {
        return PatientID;
    }

    /**
     * @param PatientID the PatientID to set
     */
    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    /**
     * @return the feedbackNotes
     */
    public String getFeedbackNotes() {
        return feedbackNotes;
    }

    /**
     * @param feedbackNotes the feedbackNotes to set
     */
    public void setFeedbackNotes(String feedbackNotes) {
        this.feedbackNotes = feedbackNotes;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }
}
