package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class UIActivityItemSourceAdapter 
    extends Object 
    implements UIActivityItemSource {

    
    
    


    
    
    @NotImplemented("activityViewControllerPlaceholderItem:")
    public Object getPlaceholderItem(UIActivityViewController activityViewController) { throw new UnsupportedOperationException(); }
    @NotImplemented("activityViewController:itemForActivityType:")
    public Object getItem(UIActivityViewController activityViewController, String activityType) { throw new UnsupportedOperationException(); }
    @NotImplemented("activityViewController:subjectForActivityType:")
    public String getSubject(UIActivityViewController activityViewController, String activityType) { throw new UnsupportedOperationException(); }
    @NotImplemented("activityViewController:dataTypeIdentifierForActivityType:")
    public String getDataTypeIdentifier(UIActivityViewController activityViewController, String activityType) { throw new UnsupportedOperationException(); }
    @NotImplemented("activityViewController:thumbnailImageForActivityType:suggestedSize:")
    public UIImage getThumbnailImage(UIActivityViewController activityViewController, String activityType, CGSize size) { throw new UnsupportedOperationException(); }

}
