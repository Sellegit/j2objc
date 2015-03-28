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


@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPMediaPickerControllerDelegate")
public interface MPMediaPickerControllerDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("mediaPicker:didPickMediaItems:")
    void didPickMediaItems(MPMediaPickerController mediaPicker, MPMediaItemCollection mediaItemCollection);
    @Mapping("mediaPickerDidCancel:")
    void didCancel(MPMediaPickerController mediaPicker);

    /*<adapter>*/
    /*</adapter>*/
}
