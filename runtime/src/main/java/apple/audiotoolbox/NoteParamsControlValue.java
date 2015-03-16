package apple.audiotoolbox;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;





@Mapping("NoteParamsControlValue") @Library("AudioToolbox/AudioToolbox.h")
public class NoteParamsControlValue 
    extends Struct 
     {

    
    protected NoteParamsControlValue() {}
    
    
    @DotMapping("mID")
    public native int getMID();
    @DotMapping("mValue")
    public native float getMValue();
    
    public static native NoteParamsControlValue create(int mID, float mValue) /*-[
        NoteParamsControlValue __new = { .mID = mID, .mValue = mValue };
        return __new;
    ]-*/;
    public static native NoteParamsControlValue copyWithmID(NoteParamsControlValue original, int mID) /*-[
        NoteParamsControlValue __new = { .mID = mID, .mValue = original.mValue };
        return __new;
    ]-*/;

    
    public static native NoteParamsControlValue copyWithmValue(NoteParamsControlValue original, float mValue) /*-[
        NoteParamsControlValue __new = { .mID = original.mID, .mValue = mValue };
        return __new;
    ]-*/;

    
}
