# URI e URL
## URI
>Gli **URI** (**Uniform Resource Identifier**) forniscono un meccanismo semplice ed estensibile per identificare una risorsa. 

>Con il termine **risorsa** intendiamo qualunque entità abbia una identità: un documento, un’immagine, un servizio, una collezione di altre risorse.

### Caratteristiche URI:
-   È un concetto generale: non fa riferimento necessariamente a risorse accessibili tramite HTTP o a entità disponibili in rete.
-   È mapping concettuale ad una entità: non si riferisce
necessariamente ad una particolare versione dell’entità
esistente in un dato momento. 

Mapping può rimanere inalterato anche se cambia il contenuto della risorsa.

Gli URI rispettano una **sintassi standard**, semplice e
regolare, gli identificatori sono **uniformi**. 

>Un identificatore è un frammento di informazione che fa
riferimento ad una entità dotata di un’identità (risorsa).

Nel caso degli URI gli identificatori sono stringhe con una sintassi definita, dipendente dallo schema, che può essere espressa nella forma più generale in questo modo:
```xml
<scheme>:<scheme-specific-part>
```
Per la componente <scheme-specific-part> non esiste una struttura o una semantica comune a tutti gli URI.
Esiste però un sottoinsieme di URI che condivide una
sintassi comune per rappresentare relazioni gerarchiche in uno spazio di nomi: 
```xml
<scheme>://<authority><path>?<query>
```
A parte *\<scheme\>*, le altre parti possono talora essere
omesse, come nei casi in cui non è inclusa la componente
*\<authority\>* o non è inclusa la componente *\<query\>*.

## URN e URL
Esistono due specializzazioni del concetto di URI:
-   >**Uniform Resource Name (URN)**: identifica una
risorsa per mezzo di un “nome” in un
particolare dominio di nomi *(namespace)* che deve essere
globalmente unico e restare valido anche se la
risorsa diventa non disponibile o cessa di esistere. Deve essere unico e duraturo. Consente di "parlare" di una risorsa prescindendo dalla sua ubicazione e dalle modalità con cui è possibile accedervi.
-   >**Uniform Resource Locator (URL)**: identifica una
risorsa per mezzo del suo meccanismo di accesso
primario (es. locazione nella rete) piuttosto che
sulla base del suo nome o dei suoi attributi.

Un esempio molto noto di URN è il codice ISBN che identifica a livello internazionale in modo univoco e duraturo un libro o una edizione di un libro di un determinato editore: *(isbn: schema, 0-9553010-9 nome univoco nel namespace)*
```
isbn:0-9553010-9
```
## URL
Un URL tiene conto anche della modalità per accedere
alla risorsa, specifica il protocollo necessario per il trasferimento della risorsa stessa (non solo HTTP, quindi...). Tipicamente il nome dello schema corrisponde al protocollo utilizzato. La parte rimanente del nome dipende dal protocollo. Nella sua forma più comune (schema HTTP-like) la sintassi è: 
```xml
<protocol>://[<username>:<password>@]<host>[:<port>][/<path>[?<query>][#fragment]]
```

### Componenti URL
-   **\<protocol\>**: Descrive il protocollo da utilizzare per l'accesso al server (HTTP, HTTPS, FTP, MMS, ...)
-   **\<username\>:\<password\>@**: credenziali per l'autenticazione 
-   **\<host\>**: indirizzo server su cui risiede la risorsa. Può essere un indirizzo IP logico o fisico.
-   **\<port\>**: definisce la porta da utilizzare (TCP come protocollo di trasporto per HTTP, che vedremo è a livello applicativo) . Se non viene indicata, si usa porta standard per il protocollo specificato (per HTTP è 80).
-   **\<path\>**: percorso (pathname) che identifica la risorsa nel file system del server. Se manca, tipicamente si accede alla risorsa predefinita (es. home page).
-   **\<query\>**: una stringa di caratteri che consente di passare al server uno o più parametri . Di solito ha questo formato: *parametro1=valore&parametro2=valore2...*

## URI opache e URI generiche
-   >**URI opaca**: non è soggetta a ulteriori operazioni di
parsing:
    -   mailto:paolo.rossi@disi.unibo.it
-   >**URI gerarchica**: è soggetta a ulteriori operazioni di parsing, per esempio per separare l’indirizzo del server dal percorso all’interno file system:
    -   http://informatica.unibo.it/
    -   docs/guide/collections/designfaq.html#28

#### Operazioni sulle URI gerarchiche

-   >**Normalizzazione**: processo di rimozione dei segmenti "." e ".. " (e altri caratteri speciali) dal path di una URI gerarchica. Si applica solo a URI gerarchiche, su URI opache non ha effetto.
-   >**Risoluzione**: è il processo che a partire da una URI originaria porta all’ottenimento di una URI risultante. La URI originaria viene risolta basandosi su una terza URI, detta **base URI**.
-   >**Relativizzazione** è il processo inverso alla risoluzione.