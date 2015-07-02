package apple.avfoundation;


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
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("AVFoundation/AVFoundation.h")
public class AVFoundation 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCoreAnimationBeginTimeAtZero")
    public static native double CoreAnimationBeginTimeAtZero();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyTitle")
    public static native String TitleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyCreator")
    public static native String CreatorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeySubject")
    public static native String SubjectValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyDescription")
    public static native String DescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyPublisher")
    public static native String PublisherValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyContributor")
    public static native String ContributorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyCreationDate")
    public static native String CreationDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyLastModifiedDate")
    public static native String LastModifiedDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyType")
    public static native String TypeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyFormat")
    public static native String FormatValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyIdentifier")
    public static native String IdentifierValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeySource")
    public static native String SourceValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyLanguage")
    public static native String LanguageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyRelation")
    public static native String RelationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyLocation")
    public static native String LocationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyCopyrights")
    public static native String CopyrightsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyAlbumName")
    public static native String AlbumNameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyAuthor")
    public static native String AuthorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyArtist")
    public static native String ArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyArtwork")
    public static native String ArtworkValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyMake")
    public static native String MakeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyModel")
    public static native String ModelValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeySoftware")
    public static native String SoftwareValue();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("AVMakeRectWithAspectRatioInsideRect")
    public static native CGRect createRectWithAspectRatioInsideRect(CGSize aspectRatio, CGRect boundingRect);

}
