package apple.mediaplayer;


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
public abstract class MPMediaPickerControllerDelegateAdapter 
    extends Object 
    implements MPMediaPickerControllerDelegate {

    
    
    
    
    
    
    
    @NotImplemented("mediaPicker:didPickMediaItems:")
    public void didPickMediaItems(MPMediaPickerController mediaPicker, MPMediaItemCollection mediaItemCollection) { throw new UnsupportedOperationException(); }
    @NotImplemented("mediaPickerDidCancel:")
    public void didCancel(MPMediaPickerController mediaPicker) { throw new UnsupportedOperationException(); }
    
}
