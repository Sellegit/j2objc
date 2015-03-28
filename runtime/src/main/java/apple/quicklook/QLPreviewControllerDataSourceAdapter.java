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
public abstract class QLPreviewControllerDataSourceAdapter 
    extends Object 
    implements QLPreviewControllerDataSource {

    
    
    


    
    
    @NotImplemented("numberOfPreviewItemsInPreviewController:")
    public @MachineSizedSInt long getNumberOfPreviewItems(QLPreviewController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("previewController:previewItemAtIndex:")
    public QLPreviewItem getPreviewItem(QLPreviewController controller, @MachineSizedSInt long index) { throw new UnsupportedOperationException(); }

}
