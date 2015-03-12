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





@Mapping("ExtendedAudioFormatInfo")
public class ExtendedAudioFormatInfo 
    extends Struct 
     {

    
    protected ExtendedAudioFormatInfo() {}
    
    
    @DotMapping("mASBD")
    public native AudioStreamBasicDescription getMASBD();
    @DotMapping("mMagicCookie")
    public native Todo getMMagicCookie();
    @DotMapping("mMagicCookieSize")
    public native int getMMagicCookieSize();
    @DotMapping("mClassDescription")
    public native AudioClassDescription getMClassDescription();
    
    public static native ExtendedAudioFormatInfo create(AudioStreamBasicDescription mASBD, Todo mMagicCookie, int mMagicCookieSize, AudioClassDescription mClassDescription) /*-[
        ExtendedAudioFormatInfo __new = { .mASBD = mASBD, .mMagicCookie = mMagicCookie, .mMagicCookieSize = mMagicCookieSize, .mClassDescription = mClassDescription };
        return __new;
    ]-*/;
    public static native ExtendedAudioFormatInfo copyWithmASBD(ExtendedAudioFormatInfo original, AudioStreamBasicDescription mASBD) /*-[
        original.mASBD = mASBD;
        return original;
    ]-*/;

    
    public static native ExtendedAudioFormatInfo copyWithmMagicCookie(ExtendedAudioFormatInfo original, Todo mMagicCookie) /*-[
        original.mMagicCookie = mMagicCookie;
        return original;
    ]-*/;

    
    public static native ExtendedAudioFormatInfo copyWithmMagicCookieSize(ExtendedAudioFormatInfo original, int mMagicCookieSize) /*-[
        original.mMagicCookieSize = mMagicCookieSize;
        return original;
    ]-*/;

    
    public static native ExtendedAudioFormatInfo copyWithmClassDescription(ExtendedAudioFormatInfo original, AudioClassDescription mClassDescription) /*-[
        original.mClassDescription = mClassDescription;
        return original;
    ]-*/;

    
}
