package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


@Library("CoreFoundation/CoreFoundation.h")
@Mapping("CFStringNormalizationForm")
public final class CFStringNormalizationForm extends ObjCEnum {
    
    @GlobalConstant("kCFStringNormalizationFormD")
    public static final long D = 0L;
    @GlobalConstant("kCFStringNormalizationFormKD")
    public static final long KD = 1L;
    @GlobalConstant("kCFStringNormalizationFormC")
    public static final long C = 2L;
    @GlobalConstant("kCFStringNormalizationFormKC")
    public static final long KC = 3L;


}
