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





@Mapping("MusicDeviceNoteParams")
public class MusicDeviceNoteParams 
    extends Struct 
     {

    
    protected MusicDeviceNoteParams() {}
    
    
    @DotMapping("argCount")
    public native int getArgCount();
    @DotMapping("mPitch")
    public native float getMPitch();
    @DotMapping("mVelocity")
    public native float getMVelocity();
    @DotMapping("mControls")
    public native NoteParamsControlValue getMControls();
    
    public static native MusicDeviceNoteParams create(int argCount, float mPitch, float mVelocity, NoteParamsControlValue mControls) /*-[
        MusicDeviceNoteParams __new = { .argCount = argCount, .mPitch = mPitch, .mVelocity = mVelocity, .mControls = mControls };
        return __new;
    ]-*/;
    public static native MusicDeviceNoteParams copyWithargCount(MusicDeviceNoteParams original, int argCount) /*-[
        original.argCount = argCount;
        return original;
    ]-*/;

    
    public static native MusicDeviceNoteParams copyWithmPitch(MusicDeviceNoteParams original, float mPitch) /*-[
        original.mPitch = mPitch;
        return original;
    ]-*/;

    
    public static native MusicDeviceNoteParams copyWithmVelocity(MusicDeviceNoteParams original, float mVelocity) /*-[
        original.mVelocity = mVelocity;
        return original;
    ]-*/;

    
    public static native MusicDeviceNoteParams copyWithmControls(MusicDeviceNoteParams original, NoteParamsControlValue mControls) /*-[
        original.mControls = mControls;
        return original;
    ]-*/;

    
}
