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





@Mapping("ExtendedAudioFormatInfo") @Library("AudioToolbox/AudioToolbox.h")
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
    
    
}
