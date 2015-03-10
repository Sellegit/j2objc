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


/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation")
public class NSPathUtilities 
    extends Object 
     {

    
    
    
    
    
    @GlobalFunction("NSUserName")
    public static native String getUserName();
    @GlobalFunction("NSFullUserName")
    public static native String getFullUserName();
    @GlobalFunction("NSHomeDirectory")
    public static native String getHomeDirectory();
    @GlobalFunction("NSHomeDirectoryForUser")
    public static native String getHomeDirectoryForUser(String userName);
    @GlobalFunction("NSTemporaryDirectory")
    public static native String getTemporaryDirectory();
    @GlobalFunction("NSOpenStepRootDirectory")
    public static native String getOpenStepRootDirectory();
    @GlobalFunction("NSSearchPathForDirectoriesInDomains")
    public static native List<String> getSearchPathForDirectoriesInDomains(NSSearchPathDirectory directory, NSSearchPathDomainMask domainMask, boolean expandTilde);
    
}
