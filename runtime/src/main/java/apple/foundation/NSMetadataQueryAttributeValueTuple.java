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


/**
 * @since Available in iOS 5.0 and later.
 */
@Library("Foundation/Foundation.h") @Mapping("NSMetadataQueryAttributeValueTuple")
public class NSMetadataQueryAttributeValueTuple 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public NSMetadataQueryAttributeValueTuple() { }

    
    @Mapping("attribute")
    public native NSMetadataItemAttribute getAttribute();
    @Mapping("value")
    public native Object getValue();
    @Mapping("count")
    public native @MachineSizedUInt long getCount();

    
    


}
