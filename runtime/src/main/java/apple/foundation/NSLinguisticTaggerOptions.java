package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;






@Mapping("NSLinguisticTaggerOptions")
public final class NSLinguisticTaggerOptions extends ObjCEnum {
    
    @GlobalConstant("NSLinguisticTaggerOmitWords")
    public static final long OmitWords = 1L;
    @GlobalConstant("NSLinguisticTaggerOmitPunctuation")
    public static final long OmitPunctuation = 2L;
    @GlobalConstant("NSLinguisticTaggerOmitWhitespace")
    public static final long OmitWhitespace = 4L;
    @GlobalConstant("NSLinguisticTaggerOmitOther")
    public static final long OmitOther = 8L;
    @GlobalConstant("NSLinguisticTaggerJoinNames")
    public static final long JoinNames = 16L;
    

}
