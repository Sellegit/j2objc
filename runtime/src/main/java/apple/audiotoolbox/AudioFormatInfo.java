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





@Mapping("AudioFormatInfo")
public class AudioFormatInfo 
    extends Struct 
     {

    
    protected AudioFormatInfo() {}
    
    
    @DotMapping("mASBD")
    public native AudioStreamBasicDescription getMASBD();
    @DotMapping("mMagicCookie")
    public native Todo getMMagicCookie();
    @DotMapping("mMagicCookieSize")
    public native int getMMagicCookieSize();
    
    public static native AudioFormatInfo create(AudioStreamBasicDescription mASBD, Todo mMagicCookie, int mMagicCookieSize) /*-[
        AudioFormatInfo __new = { .mASBD = mASBD, .mMagicCookie = mMagicCookie, .mMagicCookieSize = mMagicCookieSize };
        return __new;
    ]-*/;
    public static native AudioFormatInfo copyWithmASBD(AudioFormatInfo original, AudioStreamBasicDescription mASBD) /*-[
        original.mASBD = mASBD;
        return __new;
    ]-*/;

    
    public static native AudioFormatInfo copyWithmMagicCookie(AudioFormatInfo original, Todo mMagicCookie) /*-[
        original.mMagicCookie = mMagicCookie;
        return __new;
    ]-*/;

    
    public static native AudioFormatInfo copyWithmMagicCookieSize(AudioFormatInfo original, int mMagicCookieSize) /*-[
        original.mMagicCookieSize = mMagicCookieSize;
        return __new;
    ]-*/;

    
}
