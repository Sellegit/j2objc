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
@Adapter
public abstract class NSMetadataQueryDelegateAdapter 
    extends Object 
    implements NSMetadataQueryDelegate {

    
    
    


    
    
    @NotImplemented("metadataQuery:replacementObjectForResultObject:")
    public Object getReplacementObject(NSMetadataQuery query, NSMetadataItem result) { throw new UnsupportedOperationException(); }
    @NotImplemented("metadataQuery:replacementValueForAttribute:value:")
    public Object getReplacementValue(NSMetadataQuery query, String attrName, Object attrValue) { throw new UnsupportedOperationException(); }

}
