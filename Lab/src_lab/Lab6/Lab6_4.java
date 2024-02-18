 /* LAB 6.4:
  * String url = "https://google.com";
  * Check http OR https; domain name, .com OR .net
  */

package Lab6;
 public class Lab6_4 {
     public static void main(String[] args) {
         checkUrl("https://google.com");
     }

     public static void checkUrl(String url) {
         int protocolIndex = url.indexOf("://");
         if (protocolIndex == -1 || url.charAt(protocolIndex + 3) == '/') {
             System.out.println("Invalid URL: No protocol found.");
             return;
          }

         String protocol = url.substring(0, protocolIndex);
         if (!protocol.equals("http") && !protocol.equals("https")) {
             System.out.println("Invalid URL: Invalid protocol.");
             return;
         } else {
                System.out.printf("URL is using protocol %s\n", protocol);
                }

         int domainStartIndex = protocolIndex + 3;
         int domainEndIndex = url.indexOf(".", domainStartIndex);
         if (domainEndIndex == -1) {
             System.out.println("Invalid URL: No domain found.");
             return;
         }

         String domain = url.substring(domainStartIndex, domainEndIndex);
         System.out.printf("Domain of URL is: %s\n", domain);

         int tldStartIndex = domainEndIndex + 1;
         String topLevelDomain = url.substring(tldStartIndex);
         if (!topLevelDomain.equals("com") && !topLevelDomain.equals("net")) {
             System.out.println("Invalid URL: Invalid top level domain.");
             return;
         }
         System.out.printf("Top level domain is: %s\n", topLevelDomain);
     }
 }
