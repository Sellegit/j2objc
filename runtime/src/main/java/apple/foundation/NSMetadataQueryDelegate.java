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





@Library("Foundation/Foundation.h") @Mapping("NSMetadataQueryDelegate")
public interface NSMetadataQueryDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("metadataQuery:replacementObjectForResultObject:")
    Object getReplacementObject(NSMetadataQuery query, NSMetadataItem result);
    @Mapping("metadataQuery:replacementValueForAttribute:value:")
    Object getReplacementValue(NSMetadataQuery query, String attrName, Object attrValue);
    
    /*<adapter>*/
    /*</adapter>*/
}
