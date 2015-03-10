package apple.coremedia;


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
import apple.dispatch.*;
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;






@Mapping("CMTimeFlags")
public final class CMTimeFlags extends ObjCEnum {
    
    @GlobalConstant("kCMTimeFlags_Valid")
    public static final long Valid = 1L;
    @GlobalConstant("kCMTimeFlags_HasBeenRounded")
    public static final long HasBeenRounded = 2L;
    @GlobalConstant("kCMTimeFlags_PositiveInfinity")
    public static final long PositiveInfinity = 4L;
    @GlobalConstant("kCMTimeFlags_NegativeInfinity")
    public static final long NegativeInfinity = 8L;
    @GlobalConstant("kCMTimeFlags_Indefinite")
    public static final long Indefinite = 16L;
    @GlobalConstant("kCMTimeFlags_ImpliedValueFlagsMask")
    public static final long ImpliedValueFlagsMask = 28L;
    

}
