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





@Mapping("AudioFormatInfo") @Library("AudioToolbox/AudioToolbox.h")
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
    
    
}
