package apple.coretext;


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






@Mapping("CTFontManagerRegistrationError")
public final class CTFontManagerRegistrationError extends ObjCEnum {
    
    @GlobalConstant("kCTFontManagerErrorFileNotFound")
    public static final long FileNotFound = 101L;
    @GlobalConstant("kCTFontManagerErrorInsufficientPermissions")
    public static final long InsufficientPermissions = 102L;
    @GlobalConstant("kCTFontManagerErrorUnrecognizedFormat")
    public static final long UnrecognizedFormat = 103L;
    @GlobalConstant("kCTFontManagerErrorInvalidFontData")
    public static final long InvalidFontData = 104L;
    @GlobalConstant("kCTFontManagerErrorAlreadyRegistered")
    public static final long AlreadyRegistered = 105L;
    @GlobalConstant("kCTFontManagerErrorNotRegistered")
    public static final long NotRegistered = 201L;
    @GlobalConstant("kCTFontManagerErrorInUse")
    public static final long InUse = 202L;
    @GlobalConstant("kCTFontManagerErrorSystemRequired")
    public static final long SystemRequired = 203L;
    

}
