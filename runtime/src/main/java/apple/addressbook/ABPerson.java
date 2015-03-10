package apple.addressbook;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("AddressBook")
public class ABPerson 
    extends ABRecord 
     {

    
    
    
    
    
    @GlobalFunction("ABPersonCreate")
    public static native ABPerson create();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABPersonCreateInSource")
    public static native ABPerson create(ABRecord source);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABPersonCopySource")
    public native ABRecord getSource();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("ABPersonCopyArrayOfAllLinkedPeople")
    public native List<ABPerson> getAllLinkedPeople();
    @GlobalFunction("ABPersonGetSortOrdering")
    public static native ABPersonSortOrdering getSortOrdering();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("ABPersonGetCompositeNameFormat")
    public static native ABPersonCompositeNameFormat getConstantCompositeNameFormat();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("ABPersonGetCompositeNameFormatForRecord")
    public native ABPersonCompositeNameFormat getCompositeNameFormat();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("ABPersonCopyCompositeNameDelimiterForRecord")
    public native String getCompositeNameDelimiter();
    @GlobalFunction("ABPersonSetImageData")
    protected native boolean setImageData(NSData imageData, Todo error);
    @GlobalFunction("ABPersonCopyImageData")
    public native NSData getImageData();
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalFunction("ABPersonCopyImageDataWithFormat")
    public native NSData getImageData(ABPersonImageFormat format);
    @GlobalFunction("ABPersonHasImageData")
    public native boolean hasImageData();
    @GlobalFunction("ABPersonRemoveImageData")
    protected native boolean removeImageData(Todo error);
    @GlobalFunction("ABPersonComparePeopleByName")
    public native CFComparisonResult compareTo(ABRecord person2, ABPersonSortOrdering ordering);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("ABPersonCreatePeopleInSourceWithVCardRepresentation")
    public static native List<ABPerson> createPeopleInSource(ABRecord source, NSData vCardData);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction("ABPersonCreateVCardRepresentationWithPeople")
    public static native NSData createVCardRepresentation(List<ABPerson> people);
    
}
