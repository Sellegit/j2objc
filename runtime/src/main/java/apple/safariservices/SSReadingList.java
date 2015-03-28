package apple.safariservices;


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
 * @since Available in iOS 7.0 and later.
 */
@Library("SafariServices/SafariServices.h") @Mapping("SSReadingList")
public class SSReadingList 
    extends NSObject 
     {

    
    
    public SSReadingList() {}

    


    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("addReadingListItemWithURL:title:previewText:error:")
    public native boolean addReadingListItem(NSURL URL, String title, String previewText, Todo error);
    @Mapping("defaultReadingList")
    public static native SSReadingList getDefaultReadingList();
    @Mapping("supportsURL:")
    public static native boolean supportsURL(NSURL URL);

}
