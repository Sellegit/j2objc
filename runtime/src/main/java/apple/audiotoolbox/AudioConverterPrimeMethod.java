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





@Library("AudioToolbox/AudioToolbox.h")
@Mapping("AudioConverterPrimeMethod")
public final class AudioConverterPrimeMethod extends ObjCEnum {
    
    @GlobalConstant("kConverterPrimeMethod_Pre")
    public static final long Pre = 0L;
    @GlobalConstant("kConverterPrimeMethod_Normal")
    public static final long Normal = 1L;
    @GlobalConstant("kConverterPrimeMethod_None")
    public static final long None = 2L;
    

}
