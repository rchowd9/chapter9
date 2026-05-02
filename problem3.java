boolean isMacOS = platform.toUpperCase().contains("MAC");
boolean isIEBrowser = browser.toUpperCase().contains("IE");
boolean isResizingPossible = wasInitialized() && resize > 0;

if (isMacOS && isIEBrowser && isResizingPossible) 
{
  
}
