package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class NSXMLParserDelegateAdapter 
    extends Object 
    implements NSXMLParserDelegate {

    
    
    
    
    
    
    
    @NotImplemented("parserDidStartDocument:")
    public void didStartDocument(NSXMLParser parser) { throw new UnsupportedOperationException(); }
    @NotImplemented("parserDidEndDocument:")
    public void didEndDocument(NSXMLParser parser) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:foundNotationDeclarationWithName:publicID:systemID:")
    public void foundNotationDeclaration(NSXMLParser parser, String name, String publicID, String systemID) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:foundUnparsedEntityDeclarationWithName:publicID:systemID:notationName:")
    public void foundUnparsedEntityDeclaration(NSXMLParser parser, String name, String publicID, String systemID, String notationName) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:foundAttributeDeclarationWithName:forElement:type:defaultValue:")
    public void foundAttributeDeclaration(NSXMLParser parser, String attributeName, String elementName, String type, String defaultValue) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:foundElementDeclarationWithName:model:")
    public void foundElementDeclaration(NSXMLParser parser, String elementName, String model) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:foundInternalEntityDeclarationWithName:value:")
    public void foundInternalEntityDeclaration(NSXMLParser parser, String name, String value) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:foundExternalEntityDeclarationWithName:publicID:systemID:")
    public void foundExternalEntityDeclaration(NSXMLParser parser, String name, String publicID, String systemID) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:didStartElement:namespaceURI:qualifiedName:attributes:")
    public void didStartElement(NSXMLParser parser, String elementName, String namespaceURI, String qName, NSDictionary<?, ?> attributeDict) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:didEndElement:namespaceURI:qualifiedName:")
    public void didEndElement(NSXMLParser parser, String elementName, String namespaceURI, String qName) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:didStartMappingPrefix:toURI:")
    public void didStartMappingPrefix(NSXMLParser parser, String prefix, String namespaceURI) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:didEndMappingPrefix:")
    public void didEndMappingPrefix(NSXMLParser parser, String prefix) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:foundCharacters:")
    public void foundCharacters(NSXMLParser parser, String string) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:foundIgnorableWhitespace:")
    public void foundIgnorableWhitespace(NSXMLParser parser, String whitespaceString) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:foundProcessingInstructionWithTarget:data:")
    public void foundProcessingInstruction(NSXMLParser parser, String target, String data) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:foundComment:")
    public void foundComment(NSXMLParser parser, String comment) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:foundCDATA:")
    public void foundCDATA(NSXMLParser parser, NSData CDATABlock) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:resolveExternalEntityName:systemID:")
    public NSData resolveExternalEntityName(NSXMLParser parser, String name, String systemID) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:parseErrorOccurred:")
    public void parseErrorOccurred(NSXMLParser parser, NSError parseError) { throw new UnsupportedOperationException(); }
    @NotImplemented("parser:validationErrorOccurred:")
    public void validationErrorOccurred(NSXMLParser parser, NSError validationError) { throw new UnsupportedOperationException(); }
    
}
