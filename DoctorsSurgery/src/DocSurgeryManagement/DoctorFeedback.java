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
public class DoctorFeedback extends Doctor{
    protected int rating;
    protected String feedbackNotes;
    
    public void DoctorID(String docID){
        this.ID = docID;
    }
    
    public String getFeedbackNotes(){
        return feedbackNotes;
    }
    
    public void setFeedbackNotes(String feedbackNotes){
        this.feedbackNotes = feedbackNotes;
    }
    
    public int getRating(){
        return rating;
    }
    
    public void setRating(int rating){
        this.rating = rating;
    }
}
