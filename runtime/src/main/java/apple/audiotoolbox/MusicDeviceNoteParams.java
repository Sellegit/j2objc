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





@Mapping("MusicDeviceNoteParams") @Library("AudioToolbox/AudioToolbox.h")
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
        MusicDeviceNoteParams __new = { .argCount = argCount, .mPitch = original.mPitch, .mVelocity = original.mVelocity, .mControls = original.mControls };
        return __new;
    ]-*/;

    
    public static native MusicDeviceNoteParams copyWithmPitch(MusicDeviceNoteParams original, float mPitch) /*-[
        MusicDeviceNoteParams __new = { .argCount = original.argCount, .mPitch = mPitch, .mVelocity = original.mVelocity, .mControls = original.mControls };
        return __new;
    ]-*/;

    
    public static native MusicDeviceNoteParams copyWithmVelocity(MusicDeviceNoteParams original, float mVelocity) /*-[
        MusicDeviceNoteParams __new = { .argCount = original.argCount, .mPitch = original.mPitch, .mVelocity = mVelocity, .mControls = original.mControls };
        return __new;
    ]-*/;

    
    public static native MusicDeviceNoteParams copyWithmControls(MusicDeviceNoteParams original, NoteParamsControlValue mControls) /*-[
        MusicDeviceNoteParams __new = { .argCount = original.argCount, .mPitch = original.mPitch, .mVelocity = original.mVelocity, .mControls = mControls };
        return __new;
    ]-*/;

    
}
