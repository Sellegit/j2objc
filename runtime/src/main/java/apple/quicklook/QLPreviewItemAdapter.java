package apple.quicklook;


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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class QLPreviewItemAdapter 
    extends Object 
    implements QLPreviewItem {

    
    
    
    @NotImplemented("previewItemURL")
    public NSURL getURL() { throw new UnsupportedOperationException(); }
    @NotImplemented("previewItemTitle")
    public String getTitle() { throw new UnsupportedOperationException(); }
    
    
    
    
    
}
