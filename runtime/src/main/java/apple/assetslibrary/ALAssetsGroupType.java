package apple.assetslibrary;


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
import apple.imageio.*;





@Library("AssetsLibrary")
@Mapping("ALAssetsGroupType")
public final class ALAssetsGroupType extends ObjCEnum {
    
    @GlobalConstant("ALAssetsGroupLibrary")
    public static final long Library = 1L;
    @GlobalConstant("ALAssetsGroupAlbum")
    public static final long Album = 2L;
    @GlobalConstant("ALAssetsGroupEvent")
    public static final long Event = 4L;
    @GlobalConstant("ALAssetsGroupFaces")
    public static final long Faces = 8L;
    @GlobalConstant("ALAssetsGroupSavedPhotos")
    public static final long SavedPhotos = 16L;
    @GlobalConstant("ALAssetsGroupPhotoStream")
    public static final long PhotoStream = 32L;
    @GlobalConstant("ALAssetsGroupAll")
    public static final long All = -1L;
    

}
