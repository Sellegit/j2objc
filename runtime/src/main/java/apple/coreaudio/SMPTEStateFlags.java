package apple.coreaudio;


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






@Mapping("SMPTEStateFlags")
public final class SMPTEStateFlags extends ObjCEnum {
    
    @GlobalConstant("kSMPTETimeValid")
    public static final long Valid = 1L;
    @GlobalConstant("kSMPTETimeRunning")
    public static final long Running = 2L;
    

}
