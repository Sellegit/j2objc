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






@Mapping("CTFontPriority")
public final class CTFontPriority extends ObjCEnum {
    
    @GlobalConstant("kCTFontPrioritySystem")
    public static final long System = 10000L;
    @GlobalConstant("kCTFontPriorityNetwork")
    public static final long Network = 20000L;
    @GlobalConstant("kCTFontPriorityComputer")
    public static final long Computer = 30000L;
    @GlobalConstant("kCTFontPriorityUser")
    public static final long User = 40000L;
    @GlobalConstant("kCTFontPriorityDynamic")
    public static final long Dynamic = 50000L;
    @GlobalConstant("kCTFontPriorityProcess")
    public static final long Process = 60000L;
    

}
