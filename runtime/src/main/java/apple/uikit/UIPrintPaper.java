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



/**
 * @since Available in iOS 4.2 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIPrintPaper")
public class UIPrintPaper 
    extends NSObject 
     {

    
    
    public UIPrintPaper() {}
    
    
    @Mapping("paperSize")
    public native CGSize getPaperSize();
    @Mapping("printableRect")
    public native CGRect getPrintableRect();
    
    
    
    @Mapping("bestPaperForPageSize:withPapersFromArray:")
    public static native UIPrintPaper createBestForPageSize(CGSize contentSize, NSArray<?> paperList);
    @Mapping("printRect")
    public native CGRect getPrintRect();
    
}
