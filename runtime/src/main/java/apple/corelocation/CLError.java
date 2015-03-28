package apple.corelocation;


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
import apple.addressbook.*;
import apple.corebluetooth.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("CoreLocation/CoreLocation.h")
public class CLError 
    extends Todo 
     {

    
    
    protected CLError() {}

    
    
    
    @GlobalConstant("kCLErrorDomain")
    public static native String getClassDomain();

}
