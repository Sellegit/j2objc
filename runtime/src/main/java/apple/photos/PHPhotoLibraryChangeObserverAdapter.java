package apple.photos;


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
import apple.corelocation.*;
import apple.uikit.*;
import apple.avfoundation.*;

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class PHPhotoLibraryChangeObserverAdapter 
    extends Object 
    implements PHPhotoLibraryChangeObserver {

    
    
    


    
    
    @NotImplemented("photoLibraryDidChange:")
    public void didChange(PHChange changeInstance) { throw new UnsupportedOperationException(); }

}
