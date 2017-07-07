package com.example.android.miwok;

/**
 * Created by tarunrathode on 28/04/17.
 */

public class Word {
    /**Default translation for miwok **/

    private String mDefaultTranslation;

    /** Miwok translation for a word**/
     private String mMiwokTrabslation;

    private int mImageResourceId= NO_IMAGE_PROVIDED  ;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResorceId;


    public Word(String defaultTranslation,String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTrabslation = miwokTranslation;
        mAudioResorceId = audioResourceId;
    }

    public Word(String defaultTranslation,String miwokTranslation, int imageResourceId, int audioResorceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTrabslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResorceId = audioResorceId;
    }

    /** Get the default translation of the word **/

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /** Get the miwok translation of the word **/

    public  String getMiwokTrabslation(){
        return mMiwokTrabslation;
    }

    public int getImageResourceId(){
     return mImageResourceId;
    }

    public boolean hasImage(){

        return mImageResourceId!=NO_IMAGE_PROVIDED;

    }
    public  int getAudioResourceId(){
        return mAudioResorceId;
    }
}
