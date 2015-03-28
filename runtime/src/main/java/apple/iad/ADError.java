package apple.iad;


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
import apple.uikit.*;
import apple.addressbook.*;
import apple.mediaplayer.*;
import apple.avkit.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("iAd/iAd.h")
public class ADError 
    extends Todo 
     {

    
    
    protected ADError() {}

    
    
    
    @GlobalConstant("ADErrorDomain")
    public static native String getClassDomain();

}
