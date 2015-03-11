package apple.coredata;


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



/**
 * @since Available in iOS 3.0 and later.
 */

@Library("CoreData") @Mapping("NSPropertyMapping")
public class NSPropertyMapping 
    extends NSObject 
     {

    
    
    public NSPropertyMapping() {}
    
    
    @Mapping("name")
    public native String getName();
    public native void setName(String v);
    @Mapping("valueExpression")
    public native NSExpression getValueExpression();
    public native void setValueExpression(NSExpression v);
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    public native void setUserInfo(NSDictionary<?, ?> v);
    
    
    
    
    
}
