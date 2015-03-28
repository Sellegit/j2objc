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


@Library("Foundation/Foundation.h") @Mapping("NSNull")
public class NSNull 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public NSNull() { }

    


    
    
    @Mapping("null")
    public static native NSNull getNull();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
