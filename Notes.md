- [URI e URL](#URI-e-URL)
  - [URI](#URI)
    - [Caratteristiche URI:](#Caratteristiche-URI)
  - [URN e URL](#URN-e-URL)
  - [URL](#URL)
    - [Componenti URL](#Componenti-URL)
  - [URI opache e URI generiche](#URI-opache-e-URI-generiche)
      - [Operazioni sulle URI gerarchiche](#Operazioni-sulle-URI-gerarchiche)
- [HTTP](#HTTP)
  - [Differenze tra HTTP v1.0 e v1.1](#Differenze-tra-HTTP-v10-e-v11)
    - [Pipeling](#Pipeling)
  - [Messaggi HTTP](#Messaggi-HTTP)
  - [Header HTTP](#Header-HTTP)
  - [I comandi della richiesta](#I-comandi-della-richiesta)
    - [GET](#GET)
    - [POST](#POST)
    - [PUT](#PUT)
    - [DELETE](#DELETE)
    - [HEAD](#HEAD)
    - [OPTIONS](#OPTIONS)
    - [TRACE](#TRACE)
  - [Status Code](#Status-Code)
  - [Cookie](#Cookie)
    - [Struttura dei cookie](#Struttura-dei-cookie)
  - [Autenticazione](#Autenticazione)
    - [Riconoscimento indirizzo IP](#Riconoscimento-indirizzo-IP)
    - [Autenticazione HTTP Basic](#Autenticazione-HTTP-Basic)
    - [Autenticazione Form](#Autenticazione-Form)
  - [Sicurezza](#Sicurezza)
  - [Architetture più distribuite e articolate per il Web](#Architetture-pi%C3%B9-distribuite-e-articolate-per-il-Web)
  - [Caching Distribuito](#Caching-Distribuito)
    - [User Agent Cache](#User-Agent-Cache)
    - [Proxy Cache](#Proxy-Cache)
      - [Forward Proxy Cache](#Forward-Proxy-Cache)
      - [Reverse (server-side) Proxy Cache](#Reverse-server-side-Proxy-Cache)
    - [HTTP e Cache](#HTTP-e-Cache)
- [HTML](#HTML)
  - [Linguaggi a marcatori](#Linguaggi-a-marcatori)
    - [Caratteristiche](#Caratteristiche)
    - [SGML](#SGML)
    - [HTML e SGML](#HTML-e-SGML)
  - [Tag HTML](#Tag-HTML)
  - [DTD (Document Type Definition)](#DTD-Document-Type-Definition)
  - [Header](#Header)
    - [Elementi <meta>](#Elementi-meta)
      - [```<meta>``` http-equiv](#meta-http-equiv)
      - [```<meta>``` name](#meta-name)
  - [Body](#Body)
    - [Elementi blocco, elementi inline e liste](#Elementi-blocco-elementi-inline-e-liste)
    - [Elementi rimpiazzati e non rimpiazzati](#Elementi-rimpiazzati-e-non-rimpiazzati)
    - [Heading e paragrafi](#Heading-e-paragrafi)
    - [Gli stili del Testo](#Gli-stili-del-Testo)
    - [Liste ordinate e non ordinate](#Liste-ordinate-e-non-ordinate)
    - [Tabelle](#Tabelle)
    - [Link Ipertestuali](#Link-Ipertestuali)
      - [Anchor](#Anchor)
    - [URL relativi e assoluti](#URL-relativi-e-assoluti)
    - [Link e HTTP](#Link-e-HTTP)
    - [Immagini](#Immagini)
    - [Form](#Form)
  - [HTML5](#HTML5)
    - [Canvas](#Canvas)
    - [Video / Audio](#Video--Audio)
- [CSS](#CSS)
  - [Regole e struttura](#Regole-e-struttura)
  - [Selettori](#Selettori)
  - [Proprietà](#Propriet%C3%A0)
  - [Ereditarietà](#Ereditariet%C3%A0)
  - [Conflitti e Cascade](#Conflitti-e-Cascade)
- [Modello Web Statico/Dinamico](#Modello-Web-StaticoDinamico)
  - [CGI](#CGI)
    - [Configurazione Web Server](#Configurazione-Web-Server)
    - [Parametri GET](#Parametri-GET)
    - [Parametri POST](#Parametri-POST)
    - [Environment](#Environment)
  - [Dal modello statico a quello dinamico](#Dal-modello-statico-a-quello-dinamico)
  - [Application Server](#Application-Server)
    - [Stato](#Stato)
      - [Tipi di stato](#Tipi-di-stato)
    - [Sessione](#Sessione)
  - [Distribuzione dei servizi](#Distribuzione-dei-servizi)
  - [Replicazione dei servizi](#Replicazione-dei-servizi)
    - [Web Server](#Web-Server)
    - [Applicazione](#Applicazione)
  - [Applicazioni multi-tier](#Applicazioni-multi-tier)
- [Servlet](#Servlet)
  - [Request](#Request)
    - [Request URL e metodi](#Request-URL-e-metodi)
  - [Response](#Response)
  - [Ciclo di vita delle Servlet](#Ciclo-di-vita-delle-Servlet)
    - [Metodi per il controllo](#Metodi-per-il-controllo)
  - [Servlet e multithreading](#Servlet-e-multithreading)
  - [Deployment](#Deployment)
    - [WAR (Web ARchives) e configurazione Servlet](#WAR-Web-ARchives-e-configurazione-Servlet)
  - [Servlet Context](#Servlet-Context)
    - [Attributi di contesto](#Attributi-di-contesto)
  - [Gestione dello stato (Sessione)](#Gestione-dello-stato-Sessione)
    - [Session ID e URL rewriting](#Session-ID-e-URL-rewriting)
  - [Scoped objects](#Scoped-objects)
    - [Risorse WEB](#Risorse-WEB)
    - [Forward](#Forward)
- [JSP (Java Server Pages)](#JSP-Java-Server-Pages)
  - [Funzionamento JSP](#Funzionamento-JSP)
    - [Tag](#Tag)
  - [Built-in Objects (con scope differenziati)](#Built-in-Objects-con-scope-differenziati)
- [Javascript](#Javascript)
  - [Oggetti](#Oggetti)
    - [Costanti oggetto](#Costanti-oggetto)
    - [Array](#Array)
    - [Oggetti e Array](#Oggetti-e-Array)
    - [Stringhe](#Stringhe)
    - [Tipi valore e tipi riferimento](#Tipi-valore-e-tipi-riferimento)
  - [Funzioni](#Funzioni)
    - [Costanti funzione e costruttore Function](#Costanti-funzione-e-costruttore-Function)
    - [Metodi](#Metodi)
    - [Costruttori](#Costruttori)
  - [Operatori](#Operatori)
  - [Javascript in HTML](#Javascript-in-HTML)
    - [Browser Objects](#Browser-Objects)
  - [Modello ad eventi](#Modello-ad-eventi)
    - [Tabella riassuntiva eventi](#Tabella-riassuntiva-eventi)
    - [Gestori di evento (event handlers)](#Gestori-di-evento-event-handlers)
  - [DOM](#DOM)
    - [Form](#Form-1)
      - [Text](#Text)
      - [Validazione form](#Validazione-form)
- [AJAX](#AJAX)
  - [Tipica sequenza AJAX](#Tipica-sequenza-AJAX)
  - [Proprietà di XMLHttpRequest](#Propriet%C3%A0-di-XMLHttpRequest)
  - [Proprietà ReadyState](#Propriet%C3%A0-ReadyState)
  - [Proprietà status e statusText](#Propriet%C3%A0-status-e-statusText)
  - [Proprietà responseText](#Propriet%C3%A0-responseText)
  - [Callback](#Callback)
  - [Esempio AJAX](#Esempio-AJAX)
  - [JSON](#JSON)
    - [Parser JSON](#Parser-JSON)
    - [JSON e AJAX](#JSON-e-AJAX)
- [JDBC e accesso diretto al DB](#JDBC-e-accesso-diretto-al-DB)
    - [Utilizzo generale CLI](#Utilizzo-generale-CLI)
  - [ODBC e JDBC](#ODBC-e-JDBC)
    - [JDBC Driver Manager e Driver](#JDBC-Driver-Manager-e-Driver)
  - [Uso di JDBC](#Uso-di-JDBC)
    - [Interfaccia Driver](#Interfaccia-Driver)
    - [Interfaccia Connection](#Interfaccia-Connection)
    - [Interfaccia Statement](#Interfaccia-Statement)
    - [Interfaccia Prepared Statement](#Interfaccia-Prepared-Statement)
    - [Interfaccia Callable Statement](#Interfaccia-Callable-Statement)
    - [Interfaccia ResultSet](#Interfaccia-ResultSet)
    - [Oggetto Statement](#Oggetto-Statement)
    - [Oggetto PreparedStatement](#Oggetto-PreparedStatement)
    - [Mapping tipi JAVA - SQL](#Mapping-tipi-JAVA---SQL)
  - [Esempio di applicazione JDBC](#Esempio-di-applicazione-JDBC)
  - [SQL Injection](#SQL-Injection)
  - [Connection Pool e DataSource](#Connection-Pool-e-DataSource)
- [Metodologie di Progettazione della Persistenza: Approccio “forza bruta”, Pattern DAO, Framework ORM e Hibernate](#Metodologie-di-Progettazione-della-Persistenza-Approccio-forza-bruta-Pattern-DAO-Framework-ORM-e-Hibernate)
  - [Conflitto di impedenza](#Conflitto-di-impedenza)
  - [Brute force](#Brute-force)
  - [Pattern DAO (Data Access Object)](#Pattern-DAO-Data-Access-Object)
    - [Esempio di DAO](#Esempio-di-DAO)
  - [Retrive (risoluzione del conflitto di impedenza)](#Retrive-risoluzione-del-conflitto-di-impedenza)

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
A parte `<scheme>`, le altre parti possono talora essere
omesse, come nei casi in cui non è inclusa la componente
`<authority>` o non è inclusa la componente `<query>`.

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
-   ```<protocol>```: Descrive il protocollo da utilizzare per l'accesso al server (HTTP, HTTPS, FTP, MMS, ...)
-   ```<username\>:\<password\>@```  : credenziali per l'autenticazione 
-   ```<host>``` : indirizzo server su cui risiede la risorsa. Può essere un indirizzo IP logico o fisico.
-   ```<port>``` : definisce la porta da utilizzare (TCP come protocollo di trasporto per HTTP, che vedremo è a livello applicativo) . Se non viene indicata, si usa porta standard per il protocollo specificato (per HTTP è 80).
-   ```<path>``` : percorso (pathname) che identifica la risorsa nel file system del server. Se manca, tipicamente si accede alla risorsa predefinita (es. home page).
-   ```<query>``` : una stringa di caratteri che consente di passare al server uno o più parametri . Di solito ha questo formato: ```parametro1=valore&parametro2=valore2...```

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

# HTTP
>HTTP (Hyper Text Transfer Protocol) è il protocollo di livello applicativo utilizzato per trasferire le risorse Web (pagine o elementi di pagina) da server a client. Gestisce sia le richieste (URL) inviate al server che le risposte inviate al client (pagine).

È un protocollo **stateless**: né il server né il client mantengono, a livello di protocollo, informazioni relative ai messaggi precedentemente scambiati.
Sia le richieste al server che le risposte ai client sono
trasmesse usando stream TCP.
>**Client**: programma applicativo che stabilisce una
connessione al fine di inviare delle richieste.

>**Server**: programma applicativo che accetta connessioni al fine di ricevere richieste ed inviare specifiche risposte con le risorse richieste.

>**Connessione**: circuito virtuale stabilito a livello di trasporto tra due applicazioni per fini di comunicazione.

>**Messaggio**: è l’unità base di comunicazione HTTP, è definita come una specifica sequenza di byte concettualmente atomica.

>**Request**: messaggio HTTP di richiesta.

>**Response**: messaggio HTTP di risposta.

>**Resource**: oggetto di tipo dato univocamente definito.

>**URI**: Uniform Resource Identifier – identificatore unico per una risorsa.

>**Entity**: rappresentazione di una risorsa, può essere
incapsulata in un messaggio, tipicamente di risposta.


Segue uno schema tipo:
-   server rimane in ascolto (server passivo), tipicamente sulla porta 80.
-   client apre una connessione TCP sulla porta 80.
-   server accetta la connessione.
-   client manda una richiesta.
-   server invia la risposta e chiude la connessione7

![](Pictures/1.03.1.png)

## Differenze tra HTTP v1.0 e v1.1

La differenza principale tra HTTP 1.0 e 1.1 è la possibilità di specificare coppie multiple di richiesta e risposta nella stessa connessione. Le connessioni 1.0 vengono dette **non persistenti** mentre quelle 1.1 vengono definite **persistenti**. Il server HTTP chiude la connessione quando viene specificato nell’header del messaggio (desiderata da parte del cliente) oppure quando non è usata da un certo tempo (time out).

### Pipeling 
>Il pipelining consiste nell’invio di molteplici richieste da parte del client prima di terminare la ricezione delle risposte. Le risposte debbono però essere date nello stesso ordine delle richieste , poiché non è specificato un metodo esplicito di associazione tra richiesta e risposta.

## Messaggi HTTP
È definito da due strutture:
>**Message Header**: contiene tutte le informazioni  necessarie per identificazione del messaggio (più in generale tutte le intestazioni del messaggio).

>**Message Body**: contiene i dati trasportati dal
messaggio.

I messaggi di **Response** contengono i dati relativi alle **risorse richieste** (tipicamente una pagina html). I dati sono **codificati secondo il formato** specificato nell’header.

## Header HTTP
>Gli header sono costituiti da insiemi di coppie (nome:
valore) che specificano caratteristiche del messaggio
trasmesso o ricevuto:
-   Header *generali della trasmissione* (Data, codifica, versione, tipo di comunicazione, ecc.)
-   Header *relativi all’entità trasmessa* (Content-type, Content-Length, data di scadenza, ecc.)
-   Header riguardo la *richiesta effettuata* (chi fa la richiesta, a chi viene fatta la richiesta, ecc.)
-   Header della *risposta generata* (che server dà la risposta, che tipo di autorizzazione è necessaria, ecc.)

Il protocollo utilizza messaggi in formato ASCII (testo
leggibile; qui un esempio:
![](Pictures/1.03.2.png)

## I comandi della richiesta
### GET

-   Serve per richiedere una risorsa ad un server. È il metodo più frequente: è quello che viene attivato facendo click su un link ipertestuale di un documento HTML, o specificando un URL nell’apposito campo di un browser. 
-   È previsto il passaggio di parametri (la parte `<query>` dell’URL). 
-   La lunghezza massima di un URL è limitata.

### POST
-   Progettato come il messaggio per richiedere una risorsa. 
-   A differenza di GET, i dettagli per identificazione ed elaborazione della risorsa stessa non sono nell’URL, ma sono contenuti nel body messaggio.
-   Non ci sono limiti di lunghezza nei parametri di una richiesta.
-   Si ha una trasmissione di informazioni cliente -> servitore che però non porta alla creazione di una risorsa sul server.

### PUT
-   Chiede la memorizzazione sul server di una risorsa all’URL specificato.
-   A differenza del POST però si ha la creazione di una risorsa (o la sua sostituzione se esisteva già).
-   L’argomento del metodo PUT è la risorsa che ci si aspetta di ottenere facendo un GET con lo stesso nome in seguito.

### DELETE 
Richiede la cancellazione della risorsa riferita dall’URL specificato.

### HEAD
-   È simile al metodo GET, ma il server deve rispondere soltanto con gli header relativi, senza body.
-   Viene usato per verificare un URL:
    -   Validità: la risorsa esiste e non è di lunghezza zero.
    -   Accessibilità: non è richiesta autenticazione.

### OPTIONS 
Serve per richiedere informazioni sulle opzioni disponibili per la comunicazione.

### TRACE
-   È usato per invocare il loop-back remoto a livello applicativo del messaggio di richiesta.
-   Consente al client di vedere che cosa è stato ricevuto dal server: viene usato nella diagnostica e nel testing dei servizi Web.

## Status Code
>Lo status code è un numero di tre cifre, di cui la prima indica la classe della risposta e le altre due la risposta specifica.

Ci sono 5 classi:
-   **1xx: Informational**. Una risposta temporanea alla richiesta, durante il suo svolgimento (sconsigliata a partire da HTTP 1.0).
-   **2xx: Successful**. Il server ha ricevuto, capito e accettato la richiesta.
-   **3xx: Redirection**. Il server ha ricevuto e capito la richiesta, ma sono necessarie altre azioni da parte del client per portare a termine la richiesta.
-   **4xx: Client error**. La richiesta del client non può essere soddisfatta per un errore da parte del client (errore sintattico o richiesta non autorizzata).
-   **5xx: Server error**. La richiesta può anche essere corretta, ma il server non è in grado di soddisfare la richiesta per un problema interno (suo o di applicazioni CGI).

## Cookie
Parallelamente alle sequenze request/response, il protocollo prevede una struttura dati che si muove come un token, dal client al server e viceversa: i cookie.
I cookie possono essere generati sia dal client che dal server. Dopo la loro creazione vengono sempre passati ad ogni trasmissione di request e response. Hanno come scopo quello di fornire un supporto per il **mantenimento di stato** in un protocollo come HTTP che è essenzialmente *stateless*.

### Struttura dei cookie
-   **Key**: identifica univocamente un cookie all’interno di un dominio:path.
-   **Value**: valore associato al cookie (è una stringa di max 255 caratteri).
-   **Path**: posizione nell’albero di un sito al quale è associato (di default /).
-   **Domain**: dominio dove è stato generato
-   **Max-age**: (opzionale) numero di secondi di vita (permette la scadenza di una sessione , ne parleremo a breve... ).
-   **Secure**: (opzionale) non molto usato. Questi cookie vengono trasferiti se e soltanto se il protocollo è sicuro (https).
-   **Version**: identifica la versione del protocollo di gestione dei cookie.

## Autenticazione
### Riconoscimento indirizzo IP
Basare l’autenticazione sull’indirizzo IP del client è una soluzione che presenta vari svantaggi:
-   Non funziona se l’indirizzo non è pubblico (vedi esempio dei *NAT*).
-   Non funziona se l’indirizzo IP è assegnato dinamicamente (es. *DHCP*).
-   Esistono tecniche che consentono di presentarsi con un IP fasullo (*spoofing*).

L’autenticazione HTTP Digest è caduta in disuso negli ultimi anni (invio di password dopo hash). Normalmente si usano **Form** e **HTTP Basic**.

### Autenticazione HTTP Basic
Challenge (da parte del server): 
```
HTTP/1.1 401 Authorization Required
WWW - Authenticate: Basic realm=“Secure Area"
```

Response (da parte del cliente): 
```
GET /private/index.html HTTP/1.1
Host: localhost
Authorization: Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ== (codificato in Base64)
```

### Autenticazione Form
Normalmente si usa il metodo POST. Analoghe considerazioni a quelle fatte per HTTP Basic.

## Sicurezza 
La sicurezza del canale di trasporto è affidata a:
-   **SSL**: **Secure Socket Layer**
-   **TLS**: **Transport Layer Security**

Viene posto un livello che si occupa della gestione di confidenzialità, autenticità ed integrità della comunicazione fra HTTP e TCP. 

Basato su crittografia a chiave pubblica:
-   Private key + Public key
-   Certificato (solitamente usato per autenticare il server)

## Architetture più distribuite e articolate per il Web
>**Proxy**: Programma applicativo in grado di agire sia come Client che come Server al fine di effettuare richieste per conto di altri Clienti. Le Request vengono processate internamente oppure vengono ridirezionate al Server. Un proxy deve interpretare e, se necessario, riscrivere le Request prima di inoltrarle.

>**Gateway**: Server che agisce da intermediario per altri Server. Al contrario dei proxy, il gateway riceve le request come se fosse il server originale e Client non è in grado di identificare che Response proviene da un gateway. Detto anche *reverse proxy* o *server-side proxy*.

>**Tunnel**: Programma applicativo che agisce come “blind relay” tra due connessioni. Una volta attivo (in gergo “salito”) non partecipa alla comunicazione HTTP.

## Caching Distribuito
Memorizzare copie temporanee di documenti Web (es. pagine HTML, immagini) al fine di ridurre l’uso della banda ed il carico sul server. Una Web cache memorizza i documenti che la attraversano. L’obiettivo è usare i documenti in cache per le successive richieste qualora alcune condizioni siano verificate.

Tipi di Web cache:
-   **User Agent Cache**
-   **Proxy Cache**

### User Agent Cache
Lo user agent (tipicamente il browser) mantiene una cache delle pagine visitate dall’utente. L’uso delle user agent cache era molto importante in passato quando gli utenti non avevano accesso a connessioni di rete a banda larga. Questo modello di caching è comunque ora molto rilevante per i dispositivi mobili al fine di consentire agli utenti di lavorare con connettività intermittente ma anche per ridurre latenze dovute a caricamento di elementi statici (icone, sfondi, ...).

### Proxy Cache
#### Forward Proxy Cache
-   Servono per ridurre le necessità di banda
-   Il proxy intercetta il traffico e mette in cache le pagine.
-   Successive richieste non provocano lo scaricamento di
ulteriori copie delle pagine al server.

#### Reverse (server-side) Proxy Cache
-   Gateway cache
-   Operano per conto del server e consentono di ridurre il carico computazionale delle macchine.
-   I client non sono in grado di capire se le pagine arrivano dal server o dal gateway.
-   Internet Caching Protocol per il coordinamento fra diverse cache. Base per content delivery network.

### HTTP e Cache
HTTP definisce vari meccanismi che possono avere effetti collaterali *positivi* per la gestione *«lazy»* dell’aggiornamento cache:
-   >**Freshness**: controllata lato server da Expires response header e lato cliente da direttiva Cache-Control: max-age
-   >**Validation**: può essere usato per controllare se un elemento in cache è ancora corretto, corretto ad es. nel caso in cui sia in cache da molto tempo (ad es. tramite richieste HEAD).
-   >**Invalidation**: è normalmente un effetto collaterale di altre request che hanno attraversato la cache. Se per esempio viene mandata una POST, una PUT o una DELETE a un URL il contenuto della cache deve essere e viene automaticamente invalidato.

# HTML
>HTML è l’acronimo di HyperText Markup Language. È il linguaggio utilizzato per descrivere le pagine che costituiscono i nodi dell’ipertesto. È un linguaggio di codifica del testo del tipo a marcatori (markup).

>Un linguaggio di codifica del testo è un formalismo con il quale è possibile rappresentare un documento su supporto digitale in modo che sia trattabile dall’elaboratore in quanto testo.

I formalismi più elementari per la codifica informatica del testo sono i sistemi di codifica dei caratteri. Per codificare i caratteri si stabilisce una **corrispondenza biunivoca** tra gli elementi di una collezione ordinata di **caratteri** e un insieme di **codici numerici**. Si ottiene così un **coded character set** che di solito si rappresenta in forma di tabella ( **code page** o **code table** ). Per ciascun coded character set si definisce una codifica dei caratteri (**character encoding**). La codifica mappa una o più sequenze di byte (8 bit) a un numero intero che rappresenta un carattere in un determinato coded character set. I più noti sono *ASCII, ANSI, UTF-8*.

## Linguaggi a marcatori
>Un testo è un oggetto complesso caratterizzato da molteplici livelli strutturali che non si limitano alla sequenza di simboli del sistema di scrittura. 

>Si parla propriamente di **linguaggio di codifica testuale** solo in riferimento ai linguaggi che consentono la rappresentazione o il controllo di uno o più livelli strutturali di un documento testuale. Tali linguaggi vengono correntemente denominati linguaggi a marcatori ( mark-up languages ).

### Caratteristiche
Un linguaggio di mark-up è composto da:
-   Un insieme di istruzioni dette **tag** o **mark-up** (marcatori) che rappresentano le caratteristiche del documento testuale. 
-   Una **grammatica** che regola l’uso del mark-up.
-   Una **semantica** che definisce il dominio di applicazione e la funzione del mark-up.
   
I marcatori vengono inseriti direttamente all’interno  del testo cui viene applicato. Ogni tag è a sua volta costituito da una sequenza di caratteri, preceduta da caratteri speciali che la delimitano e permettono all’elaboratore di distinguere il testo dai marcatori.

Tradizionalmente i linguaggi di mark-up sono stati divisi in due tipologie: 
-   Linguaggi **procedurali** o **imperativi**: il mark-up specifica quali operazioni un dato programma deve compiere su un documento elettronico per ottenere una determinata presentazione (Tex, LateX).
-   Linguaggi **dichiarativi** o **descrittivi**: il mark-up descrive la struttura di un documento testuale identificandone i componenti (SGML, HTML, XML). In particolare viene descritta la struttura editoriale, costituita da componenti (content object) organizzati in modo gerarchico.

### SGML
>**SGML** = Standard Generalized Markup Language. È uno standard ISO (8879) pubblicato nel 1986.

Un documento SGML comprende oggetti di varie classi chiamati elementi capitoli, titoli, riferimenti, oggetti grafici, etc. SGML identifica gli estremi degli elementi tramite tag iniziali e tag finali. **Non contiene sequenze di istruzioni di formattazione**. Gli elementi sono organizzati in una gerarchia.

### HTML e SGML
>HTML è un’applicazione SGML, ovvero un linguaggio per  a rappresentazione di un tipo di documento SGML. Oltre a descrivere il contenuto, HTML associa anche significati grafici agli elementi che definisce! Istruzioni più o meno precise su come rendere graficamente gli elementi che definisce.

## Tag HTML
I tag HTML sono usati per definire il mark-up di elementi HTML. Sono preceduti e seguiti rispettivamente da due caratteri “<“ e “>”. Sono normalmente accoppiati; un esempio è dato da: `<p>` e `</p>`, detti rispettivamente start tag ed end tag. Il testo tra start tag ed end tag è detto contenuto dell’elemento. Un documento HTML contiene quindi elementi composti da testo semplice delimitato da tag. 

HTML rispetta in maniera poco rigorosa le specifiche SGML, esistono però delle buone pratiche che è bene rispettare e che diventano un obbligo in una versione più rigorosa del linguaggio chiamata XHTML.

>**Entity**: HTML definisce un certo numero di entità (entity) per rappresentare i caratteri speciali senza incorrere in problemi di codifica: Caratteri riservati a HTML (<, >, &, “, ecc.). Caratteri non presenti nell’ASCII a 7 bit.

>**Attributi**: Un elemento può essere dettagliato mediante attributi. Gli attributi sono coppie “nome = valore” contenute nello start tag con una sintassi di questo tipo:
```html
<tag attrib1=‘valore1’ attrib2=‘valore2’>
```

>**Tipi MIME**: Lo standard MIME ( Multipurpose Internet Mail Extensions ) è nato originariamente per poter allegare data file (audio, video, immagini, ...) ai messaggi di posta elettronica, oggi noto anche come **Internet Media Type**, rappresenta il tipo di contenuto di un messaggio. Classifica i tipi di contenuto sulla base di una **logica a due livelli** ed è largamente utilizzata in ambito di HTML e delle tecnologie web in generale. Espresso con questa sintassi:
```
tipo/sottotipo
text/plain: testo semplice
text/html: testo HTML
```

## DTD (Document Type Definition)
>Il primo elemento di un documento HTML è la definizione del tipo di documento (**DTD**): Serve al browser per identificare le regole di interpretazione e visualizzazione da applicare al documento.

Esempio: 
```h
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" http://www.w3.org/TR/html4/loose.dtd>
```
<details>
<summary>È costituita da diverse parti: </summary>

-   **HTML** il tipo di linguaggio utilizzato è l'HTML
-   **PUBLIC** il documento è pubblico
- le specifiche non sono registrate all'ISO (altrimenti +)
- **W3C** ente che ha rilasciato le specifiche
- **DTD HTML 4.01 Transitional**: versione di HTML
- **EN** la lingua con cui è scritta il DTD è l'inglese
- **http://...** URL delle specifiche
</details>

## Header
È identificato dal tag `<head>`. 

<details>
<summary> Contiene elementi non visualizzati dal browser (informazioni di servizio): </summary>

-   **`<title>`** titolo della pagina (viene mostrato nella testata della finestra principale del browser)
-   **`<meta>`** metadati informazioni utili ad applicazioni esterne (es. motori di ricerca) o al browser (es. lingua,codifica dei caratteri utile per la visualizzazione di alfabeti non latini)
-   **`<base>`** definisce come vengono gestiti i riferimenti relativi nei link
-   **`<link>`** collegamenti verso file esterni: CSS, script, icone visualizzabili nella barra degli indirizzi del browser
-   **`<script>`** codice eseguibile utilizzato dal documento
-   **`<style>`** informazioni di stile (CSS locali)
</details>

### Elementi <meta>
Gli elementi di tipo \<meta\> sono caratterizzati da una
serie di attributi. Esistono due tipi di elementi meta, distinguibili dal primo attributo: **http-equiv** o **name**:
-   >Gli elementi di tipo **http-equiv** danno informazioni al browser su come gestire la pagina. Hanno una struttura di questo tipo: 
```html
<meta http-equiv=nome content=valore>
```

-   >Gli elementi di tipo **name** forniscono informazioni utili ma non critiche. Hanno una struttura di questo tipo:
```html 
<meta name=nome content=valore>
```

#### ```<meta>``` http-equiv
<details>
<summary> Dettagli: </summary>

-   **refresh**: indica che la pagina deve essere ricaricata dopo un numero di secondi definito dall’attributo content:
```html
<meta http-equiv=refresh content=45> 
```
-   **expires**: stabilisce una data scadenza (fine validità) per il documento.
```html
<meta http-equiv=expires content="Tue, 20 Aug 1996 14:25:27 GMT">
```
-   **content type**: definisce il tipo di dati contenuto nella pagina (di solito il tipo MIME text/html):
```html
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
```
</details>

#### ```<meta>``` name
<details>
<summary> Dettagli: </summary>

-   **author**: autore della pagina: 
```html
<meta name=author content=‘John Smith’>
```
-   **description**: descrizione della pagina
```html
<meta name=description content=“Home page UNIBO">
```
-   **copyright**: indica che la pagina è protetta da un diritto d’autore
```html
<meta name=copyright content="Copyright 2009, John Smith">
```
-   **keywords**: lista di parole chiave separate da virgole, usate dai motori di ricerca
```html
<meta name=keywords lang="en" content="computer documentation, computers, computer help">
```
-   **date**: data di creazione del documento
```html
<meta name="date" content="2008-05-07T09:10:56+00:00">
```
</details>

## Body
>Il tag <body> delimita il corpo del documento. Contiene la parte che viene mostrata dal browser.

</details>
<details>
<summary>Ammette diversi attributi tra cui:</summary>

-   **background** = uri. Definisce l’URI di una immagine da usare come sfondo per la pagina.
-   **text** = color. Definisce il colore del testo
-   **bgcolor** = color. In alternativa a background definisce il colore di sfondo della pagina
-   **lang** = linguaggio definisce il linguaggio utilizzato nella pagina *es. language="it"*.
</details>

<details>
<summary>Tipi di elementi del body</summary>

-   **Intestazioni**: titoli organizzati in gerarchia
-   **Strutture di testo**: paragrafi, testo indentato, ecc.
-   **Aspetto del testo**: grassetto, corsivo, ecc.
-   **Elenchi e liste**: numerati, puntati
-   **Tabelle**
-   **Form** (moduli elettronici): campi di inserimento, checkbox e radio button, menu a tendina, bottoni, ecc.
-   **Collegamenti ipertestuali** e ancore
-   **Immagini e contenuti multimediali** (audio, video, animazioni, ecc.)
-   **Contenuti interattivi**: script, applicazioni esterne.
</details>

### Elementi blocco, elementi inline e liste
Dal punto di vista del layout della pagina gli elementi HTML si dividono in 3 grandi categorie: 
1.  **Elementi “block-level”**: costituiscono un blocco attorno a sé, e di conseguenza «vanno a capo» (paragrafi, tabelle, form...)
2.  **Elementi “inline”**: non vanno a capo e possono essere integrati nel testo (link, immagini,...)
3.  **Liste**: numerate, puntate 
  
>**Regole di composizione**: Un elemento block-level può contenere altri elementi dello stesso tipo o di tipo inline. Un elemento inline può contenere solo altri elementi inline.

### Elementi rimpiazzati e non rimpiazzati
>Gli elementi rimpiazzati sono quelli di cui il browser conosce le dimensioni intrinseche. Sono quelli in cui altezza e larghezza sono definite dall'elemento stesso e non da ciò che lo circonda. L'esempio più tipico di elemento rimpiazzato è `<img>` o `<input>`.

Tutti gli altri elementi sono in genere considerati non rimpiazzati.

### Heading e paragrafi
>La "h" sta per **"heading"**, cioè titolo e sono previste 6 grandezze; I tag `<h1>`,`<h2>` ... `<h6>` servono per definire dei titoli di importanza decrescente (`<h1>` è il più importante). 

>Il **paragrafo** è l'unità di base entro cui suddividere un testo: è un elemento di tipo blocco. Il tag `<p>` lascia una riga vuota prima della sua
apertura e dopo la sua chiusura. È possibile definire l’allineamento di un paragrafo mediante l’attributo align. (*left, center, right, justify*).

>Se al posto di `<p>` si usa il **tag `<div>`** il blocco di testo va a capo, ma - a differenza del paragrafo - non lascia spazi prima e dopo la sua apertura. È l'elemento di tipo blocco per eccellenza.

>Lo **`<span>`** è un contenitore generico che può essere annidato (ad esempio) all'interno dei **`<div>`**. È un elemento inline, e quindi non va a capo ma continua sulla stessa linea del tag che lo include.

>Il **tag `<hr>`** serve ad inserire una riga di separazione. Esempio: `<hr noshade size="5" width="50%" align="center">`

### Gli stili del Testo
Nella terminologia tipografica lo "stile di un testo" indica le possibili varianti di forma di un carattere: tondo (normale), neretto (grassetto), corsivo. HTML consente di definire lo stile di un frammento di testo, combinando fra loro anche più stili. I tag che svolgono questa funziona vengono normalmente suddivisi in fisici e logici:
-   >**Tag fisici**: definiscono lo stile del carattere in termini grafici indipendentemente dalla funzione del testo nel documento. Ad esempio: `<i>`...`</i>` = Corsivo; `<b>`...`</b>` = Grassetto...
-   >**Tag logici**: forniscono informazioni sul ruolo svolto dal contenuto, e in base a questo adottano uno stile grafico. Ad esempio: `<code>` `<pre>` Codice: usualmente monospace; `<blockquote>` Blocco di citazione.

>Il **tag `<font>`** permette di formattare il testo, definendo dimensioni, colore, tipo di carattere.

### Liste ordinate e non ordinate
>Il tag **`<ul>`** (**unordered list**) permette di definire liste non ordinate (puntate). Gli elementi della lista vengono definiti mediante il tag **`<li>`** (**list item**).

>Il tag **`<ol>`** (**ordered list**) permette di definire liste ordinate (numerati). Gli elementi vengono definiti mediante il tag **`<li>`**.

>Il tag **`<dl>`** (**definition list**) permette di definire liste di definizione. Sono liste costituite alternativamente da termini (tag **`<dt>`**) e definizioni (tag **`<dd>`**).

### Tabelle
Il tag **`<table>`** racchiude la tabella. 
<details>
<summary>Attributi:</summary>

-   ```align = “{left|center|right}”``` allineamento della tabella rispetto alla pagina;
-   ```width=“n|n%”``` larghezza della tabella (anche in percentuale rispetto alla pagina);
-   ```bgcolor=“#xxxxxx”``` colore di sfondo della tabella;
-   ```border=“n”``` spessore dei bordi della tabella (0 = tabella senza bordi);
-   ```cellspacing, cellpadding```
</details>

<details>
<summary>Righe: </summary>

**`<tr>`** è il tag che racchiude ciascuna riga della tabella. Attributi: align = ```“{left|center|right|justify}”```. 
valign = ```“{top|middle|bottom|baseline}”```.
bgcolor=```“#xxxxxx”```.
</details>

<details>
<summary>Testate e celle: </summary>

**`<th>`** e **`<td>`** sono i tag che racchiudono le celle (stessi attributi di tr):
-   **`<th>`** serve per le celle della testata.
-   **`<td>`** serve per le celle del contenuto.
</details>

### Link Ipertestuali
>Il link è il costrutto di base di un ipertesto. Caratterizza HTML come linguaggio a marcatori per la descrizione di ipertesti. È una connessione fra una risorsa Web ed un’altra. Un link è costituito da due estremi - detti anchor. L’àncora di origine (source anchor) è un elemento contenuto nella pagina di partenza. L’àncora di destinazione (destination anchor) è una qualsiasi risorsa web che si ottiene «visitando» il link.

#### Anchor
In HTML le ancore, sia di origine che di destinazione, si esprimono utilizzando il tag \<a\>. Le **àncore di origine** sono caratterizzate da un attributo, denominato **href**, che contiene l’indirizzo di destinazione (è un URL). Le **àncore di destinazione** sono invece caratterizzate dall’attributo **name**.

### URL relativi e assoluti
Gli URL utilizzati nell’attributo HREF possono essere assoluti o relativi. Se sono relativi si procede alla «risoluzione» utilizzando come base quella del documento corrente (modificabile tramite tag ```<base>```).  

URL corrente: www.disi.unibo.it/docs/page1.html   
URL in href: page2.html  
URL base: www.disi.unibo.it/docs/  
URL assoluto: www.disi.unibo.it/docs/page2.html 

### Link e HTTP
1. L’URL definito dall’attributo HREF viene «risolto»
2. Se è un URL HTTP, viene fatta una chiamata HTTP di tipo **GET** al server in cui si trova il documento
3. La pagina viene caricata e visualizzata dal browser
4. Se è stata definita anche la parte fragment (#xxxxxx) il browser si porta al punto della pagina specificato 

### Immagini
Il tag **`<img>`** consente di inserire immagini in un documento HTML.  

<details>
<summary>Attributi:</summary>

- ```src = uri``` specifica l’indirizzo dell’immagine (required)
- ```alt = text``` testo alternativo nel caso fosse impossibile visualizzare l’immagine
- ```align = {bottom|middle|top|left|right}``` (deprecato in HTML 4.01) posizione dell’immagine rispetto al testo che la circonda
- ```width,height = pixels``` larghezza e altezza dell’immagine in pixel
- ```border = pixels``` (deprecato in HTML 4.01) spessore del bordo dell’immagine
</details>

### Form
Un form (modulo) è una sezione di documento HTML che contiene elementi di controllo che l’utente può utilizzare per inserire dati o in generale per interagire
Il tag ```<form>``` racchiude tutti gli elementi del modulo (è un elemento di tipo blocco)

<details>
<summary>Attributi:</summary>

- ```action = uri ``` URI dell’agente che riceverà i dati del form
- ```name = text``` specifica il nome del form
- ```method = {get|post}``` specifica il modo in cui i dati vengono inviati
- ```enctype = content-type``` se il metodo è POST specifica il content type usato per la codifica (encoding) dei dati contenuti nel form
</details>

Con il tag **`<fieldset>`** si possono creare gruppi di campi
a cui è possibile attribuire un nome utilizzando il tag
**`<legend>`**.

La maggior parte dei controlli viene definita mediante il tag **`<input>`**:

<details>
<summary><b>Input text</b></summary>

È un campo per l’inserimento di testo su una sola riga. 
Attributi:
- ```name = text``` nome del controllo
- ```value = text``` eventuale valore iniziale
- ```size = n``` lunghezza del campo (numero di caratteri)
- ```maxlength = n``` massima lunghezza del testo (numero di caratteri)
</details>

<details><summary><b>Input file</b></summary>

Consente di fare l’upload di un file selezionandolo nel filesystem del client. 
Attributi:

- ```name = text``` specifica il nome del controllo
- ```value = content-type``` lista di MIME types per l’upload
</details>

<details><summary><b>Checkbox</b></summary>

Un input con tipo “checkbox” definisce una casella di
spunta.
Attributi:
-   `name = text` nome del controllo
-   `value = text` valore restituito se la casella viene spuntata
-   `checked = “checked”`
</details>

<details><summary><b>Radio button</b></summary>

Un radio button è una casella di spunta che serve per realizzare gruppi di scelta mutuamente esclusivi. Tutti i controlli di questo tipo che condividono lo stesso nome sono esclusivi fra di loro .Si può stabilire che un bottone è spuntato per default con l’attributo checked nella forma: `checked=“checked”`
</details>

<details><summary><b>Buttons</b></summary>

Per i bottoni si utilizzano tre valori dell’attributo type:
-   **submit** per il bottone che provoca la spedizione del form al server.
-   **reset** per il bottone che riporta il contenuto dei campi al valore originale.
-   **button** per un generico bottone di azione.

L’etichetta che compare nel bottone viene definita usando l’attributo **value**.

In HTML 4 è stato introdotto il tag **`<button>`** che offre la possibilità di creare dei bottoni con un aspetto anche complesso. Infatti `<button>` dà la possibilità di inserire il testo del bottone come contenuto del tag. Questo consente di specificare anche codice HTML all'interno del tag: testo formattato ma anche immagini 
</details>

<details><summary><b>Select (liste di opzioni)</b></summary>

-   Il tag **`<select>`** permette di costruire liste di opzioni. 
-   Per definire le singole opzioni si usa il tag `<option>`. 
-   Ricorrendo all’attributo **value** si può attribuire il valore. 
-   Con l'attributo **selected** si può indicare una scelta predefinita: `selected=“selected”`.
-   L’aspetto di default è quello di un combo box (tendina a discesa).

Se si utilizza l’attributo multiple (nella forma `multiple=“multiple”`) non abbiamo più un combo ma una lista sempre aperta. Si può operare una scelta multipla tenendo premuto il tasto **[Ctrl]** durante la selezione. L’attributo **size** determina il numero di righe mostrate.
</details>

<details><summary><b>Optgroup (gruppi di opzioni)</b></summary>

Con il tag **`<optgroup>`** è possibile organizzare la lista (sia a scelta singola che multipla) in gruppi. Molto utile per liste lunghe.
</details>

<details><summary><b>Textarea</b></summary>

Il tag **`<textarea>`** consente di definire un campo di inserimento multiriga adatto a un testo lungo. Il contenuto dell’elemento è il testo iniziale. L'attributo **rows** indica il numero di righe della textarea, **cols** il numero di caratteri (cioè di colonne) che ogni riga può contenere.
</details>

Il tag **`<label>`** permette di associare un’etichetta ad un qualunque controllo di un form. L’associazione può essere fatta in forma implicita inserendo il controllo nell’elemento label oppure in forma esplicita tramite l’attributo **for** che deve corrispondere all’attributo **id** del controllo.

## HTML5
Tra le tante cose, HTML 5 estende notevolmente la possibilità di integrazione di contenuti multimediali nella pagina (embedded content). Elementi come `<audio>`, `<video>`, `<canvas>`, `<math>` permettono di includere contenuti con i quali, è possibile interagire in modo avanzato. Il modello ad eventi di DOM è esteso con eventi specifici che permettono la costruzione di applicazioni sofisticate client-side . Agli eventi si aggiungono nuove API per la manipolazione degli oggetti DOM. 
### Canvas
Una delle più importanti innovazioni di HTML 5 è la possibilità di disegnare direttamente sulla pagina e interagire con gli oggetti multimediali. 
>L’elemento **`<canvas>`** definisce un’area rettangolare in cui disegnare direttamente immagini bidimensionali e modificarle in relazione a eventi, tramite funzioni Javascript. 

La larghezza e l’altezza del canvas sono specificati tramite gli attributi **width** e **height** dell’elemento `<canvas>`. Le coordinate (0,0) corrispondono all’angolo in alto a sinistra.

### Video / Audio
L’elemento **`<video>`** specifica un meccanismo generico per il caricamento di file e stream video, più alcune proprietà DOM per controllarne l’esecuzione. Ogni elemento `<video>` in realtà può contenere diversi elementi **`<source>`** che specificano diversi file, tra i quali il browser sceglie quello da eseguire. L’elemento **`<audio>`** è usato allo stesso modo per i contenuti sonori.

*Non esiste tuttavia una codifica universalmente accettata ma è necessario codificare il video (o audio) in più formati, per renderlo realmente «cross-browser»*

# CSS
>I fogli di stile a cascata (Cascading Style Sheets = CSS) hanno lo scopo fondamentale di separare contenuto e presentazione nelle pagine Web. 

Il linguaggio HTML serve a definire il contenuto (ma anche struttura, linking e semantica ) senza tentare di dare indicazioni su come rappresentarlo. I CSS servono a definire come il contenuto deve essere presentato all’utente.

>**Cascading**: È prevista ed è incoraggiata la presenza di fogli di stile multipli, che agiscono uno dopo l'altro, in cascata, per indicare le caratteristiche tipografiche e di layout di un documento HTML.

I vantaggi della separazione di competenze sono evidenti:
-   Lo stesso contenuto diventa riusabile in più contesti
-   Basta cambiare i CSS e può essere presentato correttamente in modo ottimale su dispositivi diversi (es. PC e palmari) o addirittura su media diversi (es. video e carta).
-   Si può dividere il lavoro fra chi gestisce il contenuto e chi si occupa della parte grafica.

Il supporto dei vari browser a CSS è complesso e difficile, infatti, tutti hanno supportato aspetti diversi ed incompatibili delle caratteristiche di CSS. A queste pagine è possibile trovare il supporto dei browser alle singole feature delle varie versioni di CSS:
-   http://caniuse.com
-   http://www.w3schools.com/css/
-   http://www.w3schools.com/css3/

Fra le due sintassi per gli stili esterni:
-   Quella con `<link>` è più diffusa
-   Quella con `@import` è meno critica per la
compatibilità con i vecchi browser.

## Regole e struttura
>Un’espressione come la seguente prende il nome di **regola CSS**: 
```css
H1 { color: blue }
```
Una regola CSS è composta da due parti:
1.  **Selettore**: H1
2.  **Dichiarazione**: `color: blue`
    -   **Proprietà**: `color`
    -   **Valore**: `blue`

## Selettori
>Il selettore serve per collegare uno stile agli elementi a cui deve essere applicato.
-   **Selettore universale**: identifica qualunque elemento: **`* { }`**
-   **Selettori di tipo**: si applicano a tutti gli elementi di un determinato tipo (ad es. tutti i `<p>`) : **`tipo_elemento { }`**
-   **Classi**: si applicano a tutti gli elementi che presentano l’attributo `class=“nome_class”`.
**`.nome_classe { }`**
-   **Identificatori**: si applicano agli elementi che
presentano l’attributo `id=“nome_id”`: **`#nome_id { }`**
-   **Pseudoclassi:** si applicano ad un sottoinsieme degli elementi di un tipo identificato da una proprietà: **`tipo_elemento:proprietà { ... }`**
-   **Pseudoelementi:** si applicano ad una parte di un
elemento: **`tipo_elemento:parte { ... }`**
-   **Selettori gerarchici**: si applicano a tutti gli elementi di un dato tipo che hanno un determinato legame gerarchico (discendente, figlio, fratello) con elementi di un altro tipo.
    -   **`tipo1 tipo2 { ... }`** tipo2 discende da tipo1
    -   **`tipo1>tipo2 { ... }`** tipo2 è figlio di tipo1
    -   **`tipo1+tipo2 { ... }`** tipo2 è fratello di tipo1
-   Se la stessa dichiarazione si applica a più tipi di
elemento si scrive una regola in **forma raggruppata**: **`H1, H2, H3 { ... }`**

## Proprietà
>Le proprietà singole permettono di definire un singolo aspetto di stile.

>Le shorthand properties consentono invece di definire un insieme di aspetti, correlati fra di loro usando una sola proprietà.
<details><summary>Valori:</summary>

-   **Numeri interi e reali**: *“.”* come separatore decimale.
-   **Grandezze**: usate per lunghezze orizzontali e verticali: un numero seguito da una unità di misura.
-   **Unità di misura relative**
    -   **em**: è relativa alla dimensione del font in uso (es. se il font ha corpo 12pt, 1em varrà 12pt, 2em varranno 24pt)
    -   **px**: pixel, sono relativi al dispositivo di output e alle impostazioni del computer dell'utente
-   **Unità di misura assolute**:
    -   **in**: pollici; (1 in =2.54 cm)
    -   **cm**: centimetri
    -   **mm**: millimetri
    -   **pt**: punti tipografici (1/72 di pollice)
    -   **pc**: pica = 12 punti
-   **Percentuali**: percentuale del valore che assume la proprietà stessa nell'elemento padre; un numero seguito da %.
-   **URL assoluti o relativi**; si usa la notazione `url(percorso)`.
-   **Stringhe**: testo delimitato da apici singoli o doppi.
-   **Colori**: possono essere identificati con tre metodi differenti:
    -   In forma **esadecimale** #RRGGBB
    -   Tramite la funzione **rgb(rosso,verde,blu)**
    -   Usando una serie di parole chiave che possono indicare colori assoluti o dipendenti dall’impostazione del PC (proprietà di sistema)
</details>

Per poter rappresentare una pagina HTML il browser deve riuscire ad applicare ad ogni elemento uno stile. 

>L’**attribuzione** può essere **diretta** se l’elemento contiene uno stile inline. Esistono una o più regole il cui selettore rimanda all’elemento. 

>Oppure può essere **indiretta** se l’elemento “eredita” lo stile dall’elemento che lo contiene.

## Ereditarietà
>È un meccanismo di tipo differenziale simile per certi aspetti all’ereditarietà nei linguaggi ad oggetti. Si basa sui blocchi annidati di un documento HTML.

Uno stile applicato ad un **blocco esterno** si applica anche ai blocchi in esso contenuti.

In un **blocco interno**:
-   Si possono definire stili aggiuntivi
-   Si possono ridefinire stili definiti in un blocco più esterno (è una sorta di overriding )

Lo stesso ragionamento si può esprimere in termini di DOM: un nodo figlio eredita gli stili dei nodi che si trovano sul ramo da cui discende.

## Conflitti e Cascade
Nell’applicare gli stili possono nascere conflitti di competenza per diversi motivi:
-   Esiste un’intersezione tra regole che utilizzano selettori di tipo diverso, ad esempio ID e Classe come in questo caso:
```css
p#myID {text-color=red}
p.myClass {text-color=blue}
<p id=myID class=myClass>
```
-   Una pagina usa più fogli di stile oppure combina fogli di stile esterni e regole interne o inline. 
-   Nello stesso foglio stile ci sono regole con lo stesso selettore e dichiarazioni diverse.

>Lo standard CSS definisce un insieme di regole di risoluzione dei conflitti che prende il nome di **cascade**. La logica di risoluzione si basa su tre elementi:
1.  **Origine del foglio stile**:
    1.  *Autore*: stile definito nella pagina
    2.  *Browser*: foglio stile predefinito
    3.  *Utente*: in alcuni browser si può editare lo stile
2.  **Specificità**: esiste una formula che misura il grado di specificità attribuendo, ad es., un punteggio maggiore ad un selettore di ID rispetto ad uno di Classe
3.  **Dichiarazione ```!important```**: è possibile aggiungere al
valore di una dichiarazione la clausola `!important
p.myClass {text-color: red !important}`. Una clausola marcata come `!important` avrà sempre precedenza sulle altre.

Il CSS assegna un peso a ciascun blocco di regole; In caso di conflitto vince quella con peso maggiore. Per **determinare il peso** si applicano in sequenza una serie di regole:
1.  **Origine**: l’ordine di prevalenza è autore, utente, browser
2.  **Specificità del selettore**: ha la precedenza il selettore con specificità maggiore.
3.  **Ordine di dichiarazione**: se esistono due dichiarazioni con ugual specificità e origine vince quella fornita per ultima.


# Modello Web Statico/Dinamico
> **Modello statico**: Il modello che abbiamo analizzato finora, basato sul concetto di ipertesto distribuito, ha una natura essenzialmente statica. Anche se l’utente può percorrere dinamicamente l’ipertesto in modi molto diversi, l’insieme dei contenuti è prefissato staticamente: le pagine vengono preparate staticamente a priori, non esistono contenuti composti dinamicamente in base all’interazione con l’utente. È un modello semplice, potente, di facile implementazione efficiente, ma presenta evidenti limiti.

Esempio di ricerca con form GET:
```html
<html>
  <head>
    <title> Ricerca dinosauri </title>
  </head>
  <body>
    <p>Enciclopedia dei dinosauri - Ricerca</p>
    <form method="GET" action="http://www.dino.it/cerca">
      <p>Nome del dinosauro
        <input type="text" name="nomeTxt" size="20">
        <input type="submit" value="Cerca" name="cercaBtn">
      </p>
    </form>
  </body>
</html>
```
Web server non è in grado di interpretare immediatamente questa chiamata (URL con query) perché **richiede l’esecuzione dinamica** di un’applicazione legata al particolare contesto. È quindi necessaria un’**estensione specifica**: un programma scritto appositamente per l’enciclopedia che interpreti i parametri passati nel GET, cerchi nel file system la pagina e la restituisca al Web server per l’invio al client.

## CGI
La prima soluzione proposta per risolvere questo problema prende il nome di **Common Gateway Interface (CGI)**, già presente fino da HTTPv1.0. 
>CGI è uno standard per interfacciare applicazioni esterne con Web server. Un programma CGI viene eseguito dinamicamente in risposta alla chiamata e produce output che costituisce la risposta alla richiesta http (informazione dinamica). Può essere scritto in qualunque linguaggio: ad esempio in C o in un linguaggio di script (spesso PHP o Perl) o in un qualche linguaggio ibrido (es. Python).

Le operazioni si svolgono nel seguente ordine:
1. Il client, tramite HTTP, invia al server la richiesta di eseguire un programma CGI con alcuni parametri e dati in ingresso
2. Il server, attraverso l'**interfaccia standard CGI(accordo standardizzato)**, chiama il programma passandogli i parametri e i dati inviati dal client 
3. Eseguite le operazioni necessarie, il programma CGI rimanda al server i dati elaborati (pagina HTML), sempre facendo uso dell'interfaccia CGI 
4. Il server invia al client i dati elaborati dal programma CGI tramite protocollo HTTP 

I programmi CGI e il server comunicano in quattro modi (specificati nell’interfaccia standard CGI):
1.  **Variabili di ambiente** del sistema operativo
2.  **Parametri sulla linea di comandi**: programma CGI viene lanciato in un processo pesante (si pensi a shell di sistema operativo che interpreta i parametri passati, ad esempio in metodo GET)
3.  **Standard Input** (usato con il metodo POST)
4.  **Standard Output**: per restituire al server la pagina HTML da inviare al client

Il programma CGI elabora i dati in ingresso ed emette
un output per il client in attesa di risposta. Per passare i dati al server il programma CGI usa **`stdout`**.

### Configurazione Web Server
Se arriva URL `www.dino.it/cgi-bin/cerca server` deve rendersi conto che cerca non è un documento HTML ma un programma CGI. Perché ciò accada è necessario che:
- I programmi CGI siano tutti in un'apposita directory
- Nella configurazione del server sia specificato il path ove trovare i programmi CGI e l'identificatore che indica che è richiesta l'esecuzione di una applicazione.

### Parametri GET
>Con il metodo GET il server passa il contenuto della form al programma CGI come se fosse da linea di comando di una shell.

```http
www.dino.it/cerca?nomeTxt=diplodocus&cercaBtn=Cerca
```
### Parametri POST
>Come abbiamo già visto, usando POST non viene aggiunto nulla alla URL specificata da ACTION. I dati del form, contenuti nell’header HTTP, vengono inviati al programma CGI tramite standard input. In questo modo si possono inviare dati lunghi a piacimento, senza i limiti di GET.

### Environment

Prima di chiamare il programma CGI, il Web server imposta alcune variabili di sistema corrispondenti ai principali header HTTP, ad esempio:
- **REQUEST_METHOD**: metodo usato dalla form
- **QUERY_STRING**: parte di URL che segue il "?"
- **REMOTE_HOST**: host che ha inviato la richiesta
- **CONTENT_TYPE**: tipo MIME dell’informazione contenuta nel body della richiesta (nel POST)
- **CONTENT_LENGTH**: lunghezza dei dati inviati
- **HTTP_USER_AGENT**: nome e versione del browser usato dal client 

## Dal modello statico a quello dinamico
Una soluzione ragionevole ai vari limiti del modello statico è quella di separare gli aspetti di contenuto da quelli di presentazione. Ad esempio, utilizziamo un database relazionale per memorizzare le informazioni relative ad ogni entità del modello (dinosauri).

Realizziamo alcuni programmi CGI che generano dinamicamente l’enciclopedia:
- *scheda*: crea una pagina con la scheda di un determinato dinosauro
- *indice*: crea la pagina di indice per specie (tassonomia)
- *alfabetico*: crea l’indice alfabetico
- *cerca*: restituisce una pagina con i link alle schede che contengono il testo inserito dall’utente

Tutti e 4 i programmi usano il DB per ricavare le informazioni utili per la costruzione della pagina. In questo modo la gestione dell’enciclopedia è sicuramente più semplice: basta inserire un record nel database per aggiungere una nuova specie. L’indice tassonomico e quello alfabetico si aggiornano automaticamente ed è anche possibile cambiare agevolmente layout di tutte le pagine, modificando un template vuoto che poi viene riempito con i dati a seconda del dinosauro.

L’architettura che abbiamo appena visto presenta numerosi vantaggi ma soffre anche di diversi problemi. 
- Di **prestazioni**: ogni volta che viene invocata una CGI si crea un **processo** che viene **distrutto** alla fine dell’elaborazione
- Le CGI, soprattutto se scritte in C, possono essere poco robuste (ad esempio **errore bloccante**)
- Ogni programma CGI deve reimplementare tutta una serie di parti comuni (**mancanza di moduli di base accessibili a tutti i programmi lato server**)

## Application Server

>La soluzione migliore è quella di realizzare un **contenitore** in cui far “vivere” le funzioni server-side. Il contenitore si preoccupa di fornire i servizi di cui le applicazioni hanno bisogno. Si ha così una soluzione **modulare** in cui le funzionalità ripetitive vengono portate a fattor comune. Un ambiente di questo tipo prende il nome di **application server**.

Due tecnologie storicamente molto diffuse nell’ambito
degli application server sono: .NET di Microsoft ed evoluzioni e Java J2EE. Altre soluzioni hanno una struttura più semplice e non sono application server a tutti gli effetti (si parla di moduli di estensione del Web server – comunque interessanti per applicazioni Web a rapida prototipazione e basso costo):
- PHP (molto diffuso e di semplice utilizzo)
- Le “vecchie” tecnologie ISAPI e ASP di Microsoft
- Quelle basate su linguaggio Ruby (ruby on rails)

### Stato
L’enciclopedia dei dinosauri è un’applicazione **stateless** poichè il server e i programmi CGI non hanno necessità di tener traccia delle chiamate precedenti.
L'interazione tra client e server può essere di due tipi:
- >**Stateful**:  esiste stato dell’interazione e quindi l’nesimo messaggio può essere messo in relazione con gli n-1 precedenti. Non tutte le applicazioni possono fare a meno dello
stato: In generale, tutte le volte in cui abbiamo bisogno di personalizzazione delle richieste Web, possiamo beneficiare di interazione stateful.

- >**Stateless**: non si tiene traccia dello stato, ogni messaggio è indipendente dagli altri. In termini generali, un’interazione stateless è *“feasible”* senza generare grossi problemi solo se protocollo applicativo è progettato con **operazioni idempotenti**.

#### Tipi di stato
- >**Stato di esecuzione** (insieme dei dati parziali per una elaborazione): rappresenta un avanzamento in una esecuzione; per sua natura è uno stato volatile; può essere mantenuto in memoria lato server come stato di uno o più oggetti
- >**Stato di sessione** (insieme dei dati che caratterizzano una interazione con uno specifico utente): la sessione viene gestita di solito in modo unificato attraverso l’uso di istanze di oggetti specifici (supporto a oggetti sessione)
- >**Stato informativo persistente** (ad esempio gli ordini inseriti da un sistema di eCommerce): viene normalmente mantenuto in una struttura persistente come un database

### Sessione
La sessione rappresenta lo stato associato ad una sequenza di pagine visualizzate da un utente. Contiene tutte le informazioni necessarie durante l’esecuzione, quindi: Informazioni di sistema, IP di provenienza, lista delle pagine visualizzate, ..., informazioni di natura applicativa, nome e cognome, username, quanti e quali prodotti ha inserito nel carrello per un acquisto, ... Lo scope di sessione è dato dal tempo di vita della interazione utente (**lifespan**) e dall'**accessibilità**: usualmente concesso alla richiesta corrente e a tutte le richieste successive provenienti dallo stesso processo browser.

Lo stato di sessione deve presentare i seguenti requisiti:
- Deve essere condiviso da Client e Server
- È associato a una o più conversazioni effettuate da un singolo utente
- Ogni utente possiede il suo singolo stato

Ci sono due tecniche di base per gestire lo stato, non necessariamente alternative ma integrabili:
1.  Utilizzo del meccanismo dei **cookie** (storage lato cliente)
2.  Gestione di uno stato sul server per ogni utente collegato (**sessione server-side**)

## Distribuzione dei servizi
La struttura a 3 tier (Web Server, Application Server, DataBase Server) rispecchia i 3 principali servizi che realizzano un sistema Web. Questi 3 servizi possono risiedere sullo stesso HW oppure essere divisi su macchine separate (**distribuzione verticale** dell’architettura).

Orizzontalmente ad ogni livello è possibile replicare il servizio su diverse macchine. Si parla in questo caso di **distribuzione orizzontale**. Essendo una distribuzione per replicazione è possibile implementare politiche per la gestione della **fault tolerance** e anche del **bilanciamento di carico** a fine di maggiori performance.

## Replicazione dei servizi
### Web Server
Web server è **stateless** per la natura del protocollo HTTP; per questo, molto facile da replicare. Il fatto che **IP è embedded in URL** può essere gestito attraverso diverse soluzioni sia hardware che software. Si possono applicare politiche di **load balancing** con diverse euristiche usando dispositivi appositi. 

### Applicazione
Prevalentemente si usa uno stato di sessione. Può accadere però che application server utilizzi oggetti o componenti con stato per motivi di performance (**cache**) o altre necessità specifiche. Alcuni framework disponibili sul mercato permettono replicazione attraverso **tecniche di clustering** (ne daremo cenni nella secondssa parte del corso); altri framework non sono in grado di replicare orizzontalmente. Se si mantiene lo stato concentrato all’interno della sessione e la sessione viene gestita interamente attraverso cookie, è possibile realizzare un framework applicativo completamente stateless lato server, ottenendo così realizzazione più semplice e primitiva di configurazione completamente replicabile in modo orizzontale.

## Applicazioni multi-tier
>È molto utile separare logicamente le funzioni necessarie in una struttura multilivello (multi-tier) al fine di fornire astrazioni via via più complesse e potenti a partire da funzionalità più elementari. Nel tempo si è affermata una classificazione indipendente dalla implementazione tecnologica, basata su una struttura a 4 livelli principali; non fornisce dettagli implementativi, non specifica quali moduli debbano essere implementati client-side o server-side, né nessuna altra specifica tecnica: è una architettura essenzialmente logico-funzionale.

1.  **Presentation**: Livello di presentazione si occupa della visualizzazione dei risultati generati secondo il percorso definito nel flusso sottostante. Il livello di presentazione ha il compito di interpretare i dati del business flow e generare l’interfaccia grafica per la visualizzazione dei contenuti (**rendering**). Questo permette di avere facilmente diverse modalità/tipologie di presentazione degli stessi dati (esempio italiano/inglese).
2.  **Business Flow**: A questo livello vengono implementati i flussi delle diverse conversazioni che interagiscono per comporre una applicazione. Una conversazione è realizzata da un insieme di pagine collegate in un **flusso di successive chiamate**. Il business flow raccoglie l’insieme delle chiamate necessarie per realizzare una conversazione. <br>**Ogni chiamata deve**: ▪ Caricare i parametri in ingresso ▪ Chiamare le funzioni di business logic necessarie per effettuare l’elaborazione ▪ Generare l’output che dovrà essere visualizzato.
3.  **Business Logic**: La logica di business contiene le caratteristiche delle applicazioni e dipende sia dal modello dei dati che, ancora più rilevante, dalle logiche di utilizzo degli stessi. È l’insieme di tutte le funzioni offerte; si appoggia sui servizi per implementare i diversi algoritmi di risoluzione e provvedere alla generazione dei dati di output. Così modellata, business logic presenta un **elevato grado di riuso**.
4.  **Services**: Servizi devono fornire tutte le funzionalità base (API) necessarie per l’implementazione rapida ed efficace della logica di business, dalla gestione della concorrenza al supporto alle transazioni, dall’interfacciamento ai db al monitoraggio/controllo/gestione delle performance. I servizi realizzano le funzioni di base per sviluppo di applicazioni: **Accesso e gestione risorse**, **gestione transazioni**, **gestione sicurezza**, **accesso e gestione delle sorgenti dati**.

# Servlet 

>Una **Servlet** è una classe Java che **fornisce risposte a richieste HTTP**. In termini più generali è una classe che fornisce un servizio comunicando con il client mediante protocolli di tipo request/response: tra questi protocolli il più noto e diffuso è HTTP. Le Servlet estendono le funzionalità di un Web server generando contenuti dinamici e superando i classici limiti delle applicazioni CGI ed **eseguono direttamente in un Web Container**. Sono classi che derivano dalla classe `HttpServlet`.

Esempio di risposta ridefinendo `doGet()`:

```java
...
public class HelloServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<title>Hello World!</title>");
  }
...
}
```

Le servlet HTTP sono il tipo più comune di servlet e possono processare **richieste HTTP**, producendo **response HTTP**. All’arrivo di una richiesta HTTP il Servlet Container crea un oggetto request e un oggetto response e li passa alla servlet:

![](Pictures/3-02-1.png)

## Request
>Gli oggetti di tipo Request rappresentano la chiamata al server effettuata dal client. Sono caratterizzati da varie informazioni: ▪ Chi ha effettuato la Request ▪ Quali parametri sono stati passati nella Request ▪ Quali header sono stati passati.

`request` contiene i dati inviati dal client HTTP al server. Viene creata dal servlet container e passata alla servlet come parametro ai metodi `doGet()` e `doPost()`. È un’istanza di una classe che implementa l’interfaccia `HttpServletRequest`.

Fornisce metodi per accedere a varie informazioni
- HTTP Request URL
- HTTP Request header
- Tipo di autenticazione e informazioni su utente
- Cookie
- Session

### Request URL e metodi
```http
http://[host]:[port]/[request path]?[query string]
```
La **request path** è composta dal contesto e dal nome della Web application. La **query string** è composta da un insieme di parametri che sono forniti dall’utente.

<details> <summary><b>Metodi per accedere all'URL</b></summary>

- **`String getParameter(String parName)`**: restituisce il valore di un parametro individuato per nome 
- **`String getContextPath()`**: restituisce informazioni sulla parte dell’URL che indica il contesto della Web application
- **`String getQueryString()`**: restituisce la stringa di query
- **`String getPathInfo()`**: per ottenere il path
- **`String getPathTranslated()`** per ottenere informazioni sul path nella forma risolta
</details>

<details> <summary><b>Metodi per accedere agli Header</b></summary>

- **`String getHeader(String name)`** restituisce il valore di un header individuato per nome sotto forma di stringa
- **`Enumeration getHeaders(String name)`** restituisce tutti i valori dell’header individuato da name sotto forma di enumerazione di stringhe (utile ad esempio per Accept che ammette n valori)
- **`Enumeration getHeaderNames()`** elenco dei nomi di tutti gli header presenti nella richiesta
- **`int getIntHeader(name)`** valore di un header convertito in intero 
- **`long getDateHeader(name)`** valore della parte `Date` di header, convertito in long
</details>

<details> <summary><b>Metodi per autenticazione, sicurezza e cookie</b></summary>

- **`String getRemoteUser()`** nome di user se la servlet ha accesso autenticato, null altrimenti
- **`String getAuthType()`** nome dello schema di autenticazione usato per proteggere la servlet
- **`boolean isUserInRole(java.lang.String role)`** restituisce true se l’utente è associato al ruolo specificato
- **`Cookie[] getCookies()`** restituisce un array di oggetti cookie che il client ha inviato alla request
</details>

`HttpRequest` espone anche il metodo **`InputStream getInputStream()`**: Consente di leggere il body della richiesta (ad esempio dati di post). Esempio:

```java
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  PrintWriter out = response.getWriter();
  InputStream is = request.getInputStream();
  BufferedReader in = new BufferedReader(new InputStreamReader(is));
  out.println("<html>\n<body>");
  out.println("Contenuto del body del pacchetto: "); while ((String line = in.readLine()) != null)
    out.println(line)
  out.println("</body>\n</html>");
}
```

## Response
>Gli oggetti di tipo Response rappresentano le informazioni restituite al client in risposta ad una Request ▪ Dati in forma testuale (es. html, text) o binaria (es. immagini) ▪ HTTP header, cookie, ...

Contiene i dati restituiti dalla Servlet al Client: 
- **Status line** (status code, status phrase)
- **Header della risposta HTTP** (**`public void setHeader(String headerName, String headerValue)`** imposta un header arbitrario)
- **Response body**: il contenuto (ad es. pagina HTML), disponibile in due modi:
    1. **`public PrintWriter getWriter()`**: mette a disposizione uno stream di caratteri (un’istanza di `PrintWriter`)
    2. **`public ServletOutputStream getOuputStream()`**: mette a disposizione uno stream di byte (un’istanza di `ServletOutputStream`)  

Ha come tipo l’interfaccia HttpResponse che espone metodi per:
- Specificare lo status code della risposta HTTP: **`public void setStatus(int statusCode)`**. Per inviare errori possiamo usare **`public void sendError(int statusCode, String message)`**
- Indicare il content type (tipicamente text/html): **`setContentType()`** configura il content-type (**si usa sempre**)
- Ottenere un output stream in cui scrivere il contenuto da restituire
- Gestire i cookie: **`addCookie()`**

## Ciclo di vita delle Servlet

**Servlet container** controlla e supporta automaticamente il ciclo di vita di una servlet. Se non esiste una istanza della servlet nel container carica la classe della servlet, ne crea una istanza e la inizializza (invoca il metodo **`init()`**). Poi, a regime invoca la servlet (`doGet()` o `doPost()` a seconda del tipo di richiesta ricevuta) passando come parametri due oggetti di tipo **HttpServletRequest** e **HttpServletResponse**.

### Metodi per il controllo

- **`init()`**: viene chiamato una sola volta al caricamento della servlet  In questo metodo si può inizializzare  l’istanza: ad esempio si crea la connessione con un database.
- **`service()`**: viene chiamato ad ogni HTTP Request. Chiama `doGet()` o `doPost()` a seconda del tipo di HTTP Request ricevuta. Se non viene ridefinito, il metodo service effettua il **dispatch** delle richieste ai metodi doGet, doPost, etc... a seconda del metodo HTTP usato nella request
- **`destroy()`**: viene chiamato una sola volta quando la servlet deve essere disattivata (es. quando è rimossa)

## Servlet e multithreading

- **Modello “normale”**: una **sola istanza di servlet** e **un thread assegnato ad ogni richiesta http per servlet**, anche se richieste per quella servlet sono già in esecuzione. Nella modalità normale più thread condividono la stessa istanza di una servlet e quindi si crea una situazione di concorrenza. Il metodo `init()` della servlet viene chiamato una sola volta quando la servlet è caricata dal Web container. I metodi `service()` e `destroy()` possono essere chiamati solo dopo il completamento dell’esecuzione di `init()`. Il metodo `service()` (e quindi `doGet()` e `doPost()`) può essere invocato da numerosi client in modo concorrente ed è quindi necessario gestire le sezioni critiche (a completo carico del programmatore dell’applicazione Web): Uso di blocchi synchronized, semafori, mutex...
- **Modello single threaded (deprecato)**:  si può indicare al container di creare un’istanza della servlet per ogni richiesta concorrente. Questa modalità prende il nome di Single-Threaded Model. Se una servlet vuole operare in modo single-threaded deve implementare l’interfaccia marker `SingleThreadModel`.

## Deployment
>Un’applicazione Web deve essere installata e questo processo prende il nome di deployment. Il deployment comprende: La definizione del runtime environment di una Web Application ▪ L**a mappatura delle URL sulle servlet** ▪ La definizione delle impostazioni di default di un’applicazione, ad es. welcome page e pagine di errore ▪ La configurazione delle caratteristiche di sicurezza dell’applicazione

### WAR (Web ARchives) e configurazione Servlet
>Rappresentano la modalità con cui avviene la distribuzione/deployment delle applicazioni Web. Sono file jar con una struttura particolare. La struttura di directory delle Web Application è basata sulle Servlet 2.4 specification:

![](Pictures/3-02-2.png)

**web.xml** è in sostanza un file di configurazione (XML) che contiene una serie di elementi descrittivi. Contiene l’elenco delle servlet attive sul server, il loro mapping verso URL, e per ognuna di loro permette di definire una serie di parametri come *coppie nome-valore*. 

Esempio:
```xml
<web-app>
  <servlet>
    <servlet-name>myServlet</servlet-name>
    <servlet-class>myPackage.MyServlet</servlet-class>
    <init-param>
      <param-name>parName</param-name>
      <param-value>parValue</param-value>
    </init-param>
  </servlet>
  <servlet-mapping>
    <servlet-name>myServlet</servlet-name>
    <url-pattern>/myURL</url-pattern>
  </servlet-mapping>
</web-app>
```

Una servlet accede ai propri parametri di configurazione mediante l’interfaccia **`ServletConfig`**:. Ci sono 2 modi per accedere a oggetti di questo tipo:
1.  Il parametro di tipo `ServletConfig` passato al
metodo `init()`
2.  il metodo `getServletConfig()` della servlet, che può essere invocato in qualunque momento.
  
`ServletConfig` espone un metodo per ottenere il valore di un parametro in base al nome: **`String getInitParameter(String parName)`**.

## Servlet Context

Ogni Web application esegue in un contesto: c'è **corrispondenza 1:1 tra una Web-app e suo contesto**. L’interfaccia `ServletContext` è la vista della Web application (del suo contesto) da parte della servlet.  Si può ottenere un’istanza di tipo ServletContext all’interno della servlet utlizzando il metodo **`getServletContext()`**. Consente di accedere ai parametri di inizializzazione e agli attributi del contesto, accedere alle risorse statiche della Web application (es. immagini) mediante il metodo **`getResourceAsStream(String path)`**.

<p style="color: #FF3333"><b>IMPORTANTE: servlet context viene condiviso tra tutti gli utenti, le richieste e le servlet facenti parte della stessa Web application</b></p>

I parametri di inizializzazione del contesto sono definiti all’interno di elementi di tipo context-param in web.xml

```xml
<web-app>
  <context-param>
    <param-name>feedback</param-name>
    <param-value>feedback@deis.unibo.it</param-value>
  </context-param>
  ...
</web-app>
```

Sono accessibili a tutte le servlet della Web application:
```java
…
ServletContext ctx = getServletContext();
String feedback = ctx.getInitParameter(“feedback”);
…
```

### Attributi di contesto
>Gli attributi di contesto sono accessibili a tutte le servlet e funzionano come variabili “globali”. Vengono gestiti a runtime: possono essere creati, scritti e letti dalle servlet. Possono contenere oggetti anche complessi (serializzazione/deserializzazione).

**Scrittura**:
```java
ServletContext ctx = getServletContext();
ctx.setAttribute(“utente1”, new User(“Giorgio Bianchi”));
ctx.setAttribute(“utente2”, new User(“Paolo Rossi”));
```

**Lettura**:
```java
ServletContext ctx = getServletContext();
Enumeration aNames = ctx.getAttributeNames();
while (aNames.hasMoreElements) {
  String aName = (String)aNames.nextElement();
  User user = (User) ctx.getAttribute(aName);
  ctx.removeAttribute(aName);
}
```

## Gestione dello stato (Sessione)

Come abbiamo già detto più volte, HTTP è un protocollo *stateless*: non fornisce in modo nativo meccanismi per il mantenimento dello stato tra diverse richieste provenienti dallo stesso client. Applicazioni Web hanno spesso bisogno di stato. Sono state definite due tecniche per mantenere traccia delle informazioni di stato:
- **uso dei cookie**: meccanismo di basso livello. Il cookie è un’unità di informazione che Web server deposita sul Web browser lato cliente. Sono parte dell’header HTTP, trasferiti in formato testuale avanti e indietro nelle richieste e nelle risposte. Possono però essere rifiutati dal browser! <br>La classe **`Cookie`** modella il cookie HTTP. Si recuperano i cookie dalla request utilizzando il metodo **`getCookies()`** e Si aggiungono cookie alla response utilizzando il metodo **`addCookie()`**. Con il metodo **`setSecure(true)`** il client viene forzato a inviare il cookie solo su protocollo sicuro (*HTTPS*).
- **uso della sessione** (**session tracking**): meccanismo di alto livello. La sessione Web è un’entità gestita dal Web container, condivisa fra tutte le richieste provenienti dallo stesso client: consente di mantenere, quindi, informazioni di stato (di sessione). Può contenere dati di varia natura ed è identificata in modo univoco da un **session ID**. Viene usata dai componenti di una Web application per mantenere lo stato del client durante le molteplici interazioni dell’utente con la Web application. <br>Per ottenere un riferimento ad un oggetto di tipo `HttpSession` si usa il metodo **`getSession()`** dell’interfaccia `HttpServletRequest`: **`public HttpSession getSession(boolean createNew)`**. A seconda del flag `createNew`, se `true` ritorna la sessione esistente o ne crea una nuova, se false ritorna la sessione esistente o `null`. Si possono memorizzare dati specifici dell’utente negli attributi della sessione (*coppie nome/valore*). Sono simili agli attributi di contesto, ma con **scope fortemente diverso!**, e consentono di memorizzare e recuperare oggetti. 

Esempio di sessione: 
```java
Cart sc = (Cart)session.getAttribute("shoppingCart");
sc.addItem(item);
session.setAttribute("shoppingCart", new Cart());
session.removeAttribute("shoppingCart");
Enumeration e = session.getAttributeNames();
while(e.hasMoreElements())
  out.println(“Key; “ + (String)e.nextElements());
```

<details><summary>Altri metodi per sessioni</summary>

- **`String getID()`**: restituisce l’ID di una sessione
- **`boolean isNew()`**: dice se la sessione è nuova
- **`void invalidate()`** permette di invalidare (distruggere) una sessione
- **`long getCreationTime()`** dice da quanto tempo è attiva la sessione (in millisecondi)
- **`long getLastAccessedTime()`** dà informazioni su quando è stata utilizzata l’ultima volta

Esempio:
```java
String sessionID = session.getId();
if(session.isNew())
  out.println(“La sessione e’ nuova”);
session.invalidate();
out.println(“Millisec:” + session.getCreationTime());
out.println(session.getLastAccessedTime());
```
</details>

### Session ID e URL rewriting
La **sessione rappresenta un’utile astrazione** ed essa stessa **può far ricorso a due meccanismi base di implementazione**: **Cookie** e **URL rewriting**.

Il session ID è usato per identificare le richieste provenienti dallo stesso utente e mapparle sulla
corrispondente sessione. Una tecnica per trasmettere l’ID è quella di includerlo in un cookie (**session cookie**): sappiamo però che non sempre i cookie sono attivati nel browser. Un’alternativa è rappresentata dall’inclusione del **session ID nella URL**: si parla di **URL rewriting**. È buona prassi codificare sempre le URL generate dalle servlet usando il metodo **`encodeURL()`** di `HttpServletResponse`

## Scoped objects
>Gli oggetti di tipo `ServletContext`, `HttpSession`, `HttpServletRequest` forniscono metodi per immagazzinare e ritrovare oggetti nei loro rispettivi ambiti (**scope**). Lo scope è definito dal tempo di vita (**lifespan**) e dall’accessibilità da parte delle servlet.

Ambito | Interfaccia | Lifespan | Accessibilità
|-|-|-|-|
**Request** | `HttpServletRequest` | Fino all’invio della risposta | Servlet corrente e ogni altra pagina inclusa o in forward
**Session** |`HttpSession`| Lo stesso della sessione utente | Ogni richiesta dello stesso client
**Application** | `ServletContext` | Lo stesso dell’applicazione | Ogni richiesta alla stessa Web app anche da clienti diversi e per servlet diverse

Gli oggetti **scoped** forniscono i seguenti metodi per immagazzinare e ritrovare oggetti nei rispettivi ambiti (**scope**): 
- **`void setAttribute(String name, Object o)`**
- **`Object getAttribute(String name)`**
- **`void removeAttribute(String name)`**
- **`Enumeration getAttributeNames()`**


### Risorse WEB
Includere risorse Web (altre pagine, statiche o dinamiche) può essere utile quando si vogliono aggiungere contenuti creati da un’altra risorsa (ad es. un’altra servlet). 
- Inclusione di **risorsa statica**: includiamo un’altra pagina nella nostra (ad es. banner)
- Inclusione di **risorsa dinamica**: la servlet inoltra una request ad un componente Web che la elabora e restituisce il risultato .Il risultato viene incluso nella pagina prodotta dalla servlet.

**La risorsa inclusa può lavorare con il response body** (problemi comunque con l’utilizzo di cookie).

È anche possibile inviare al browser una risposta che lo forza ad accedere ad un’altra pagina (**ridirezione**). Possiamo ottenere questo risultato in due modi, agendo sull’oggetto response:
1.  Invocando il metodo **`public void sendRedirect(String url)`**
2.  Lavorando più a basso livello con gli header: **`response.setStatus(response.SC_MOVED_PERMANENTLY);`**,**`response.setHeader("Location", "http://...");`**

Per includere una risorsa si ricorre a un oggetto di tipo **`RequestDispatcher`** che può essere richiesto al contesto indicando la risorsa da includere. Si invoca quindi il metodo **`include`** passando come parametri request e response che vengono così condivisi con la risorsa inclusa.

```java
RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/inServlet");
dispatcher.include(request, response);
```

### Forward
Anche in questo caso si deve ottenere un oggetto di tipo `RequestDispatcher` da `request` passando come
parametro il nome della risorsa. Si invoca quindi il metodo **`forward`** passando anche in questo caso `request` e `response`.

```java
RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/inServlet");
dispatcher.forward(request, response);
```

# JSP (Java Server Pages)

>Le JSP sono uno dei due componenti di base della tecnologia J2EE, relativamente alla parte Web: template per la generazione di contenuto dinamico estendondendo HTML con codice Java custom.

Quando viene effettuata una richiesta a una JSP la **parte HTML viene direttamente trascritta** sullo stream di output mentre il **codice Java viene eseguito sul server** per la generazione del contenuto HTML dinamico. La pagina HTML così formata (parte statica + parte generata dinamicamente) viene restituita al client.

Le richieste verso JSP sono gestite da una particolare servlet (in Tomcat si chiama **JspServlet**) che effettua le seguenti operazioni:
- traduzione della JSP in una servlet
- compilazione della servlet risultante in una classe
- esecuzione della JSP

Dal momento che le JSP sono compilate in servlet, il ciclo di vita delle JSP, dopo compilazione, è controllato sempre dal medesimo Web container.

Nella servlet logica per la generazione del documento HTML è implementata completamente in Java, mentre le JSP nascono proprio per facilitare la progettazione grafica e l’aggiornamento delle pagine. Se si vogliono fornire contenuti differenziati a seconda di diversi parametri quali l’identità dell’utente, condizioni dipendenti dalla business logic, etc. è conveniente continuare a lavorare con le servlet. Le JSP rendono viceversa **molto semplice presentare documenti HTML o XML** (o loro parti) all’utente; dominanti per la realizzazione di pagine dinamiche semplici e di uso frequente, sebbene vi siano maggiori problemi di controllo della correttezza e testing.

## Funzionamento JSP
Ogni volta che arriva una request, server compone dinamicamente il contenuto della pagina: Ogni volta che incontra un tag **`<%...%>`** valuta l’espressione Java contenuta al suo interno e inserisce al suo posto il risultato dell’espressione, permettendo di generare pagine dinamicamente.

**Il Client si aspetta di ricevere tutto response header prima di response body**, quindi JSP deve effettuare tutte le modifiche all’header (ad es. modifica di cookie) prima di cominciare a creare body.<br>
Una volta che Web server **comincia a restituire la risposta non può più interrompere il processo**, altrimenti il browser mostra solo la frazione parziale che ha ricevuto.

```jsp
<html>
  <body>
    <% String visitor=request.getParameter("name");
      if (visitor == null) visitor = "World"; %>Hello, <%= visitor %>!
  </body>
</html>
```
<table>
<tr><td>

```http
http://myHost/myWebApp/helloWorld.jsp
```
</td><td>

```http
http://myHost/myWebApp/helloWorld.jsp?name=Mario
```
</td></tr>
<tr><td>

```html
<html>
  <body>
    Hello, World!
  </body>
</html>
```
</td><td>

```html
<html>
  <body>
    Hello, Mario!
  </body>
</html>
```
</td></tr></table>

### Tag
Le parti variabili della pagina sono contenute all’interno di tag speciali. Sono possibili due tipi di sintassi per questi tag: 
- **Scripting-oriented tag**:  sono definite da delimitatori entro cui è presente lo scripting (self-contained), sono di quattro tipi:
    1. **`<%! %>`**: Dichiarazione
    2. **`<%= %>`**: Espressione
    3. **`<% %>`**: Scriptlet
    4. **`<%@ %>`**: Direttiva 
- **XML-Oriented tag**, seguono la sintassi XML, equivalenti a quelli visti sopra:
  1. **`<jsp:declaration>declaration</jsp:declaration>`**
  2. **`<jsp:expression>expression</jsp: expression>`**
  3. **`<jsp:scriptlet>java_code</jsp:scriptlet>`**
  4. **`<jsp:directive.dir_type dir_attribute/>`**

**Variabili e metodi**: Si usano i delimitatori **`<%!`** e **`%>`** per dichiarare variabili e metodi, che una volta dichiarati possono poi essere referenziati in **qualsiasi punto del codice** JSP. I metodi diventano metodi della servlet quando la pagina viene tradotta.

```jsp
<%! 
String name = "Paolo Rossi";
double[] prices = {1.5, 76.8, 21.5};

double getTotal() {
  double total = 0.0;
  for (int i=0; i<prices.length; i++) {
    total += prices[i];
    return total;
  }
%>
```

**Espressioni**: Si usano i delimitatori **`<%=`** e **`%>`** per valutare espressioni Java. 
>Il risultato dell’espressione viene convertito in stringa inserito nella pagina al posto del tag.

```jsp
<p>Sig. <%=name%>,</p>
<p>l’ammontare del suo acquisto è: <%=getTotal()%> euro.</p>
<p>La data di oggi è: <%=new Date()%></p>
```

**Scriplet**:
Si usano **`<%`** e **`%>`** per aggiungere un frammento di codice Java eseguibile alla JSP (scriptlet). 
>Lo scriptlet consente tipicamente di inserire logiche di controllo di flusso nella produzione della pagina.

```jsp
<% if (userIsLogged) { %>
  <h1>Benvenuto Sig. <%=name%></h1>
<% } else { %>
  <h1>Per accedere al sito devi fare il login</h1>
<% } %>
```
**Direttive**:
Sono comandi JSP valutati a tempo di compilazione ▪ Le più importanti sono:
- **page**: permette di importare package, dichiarare pagine d’errore, definire modello di esecuzione JSP relativamente alla concorrenza (ne discuteremo a breve), ecc.
- **include**: include un altro documento
- **taglib**: carica una libreria di custom tag implementate dallo sviluppatore

```jsp
<%@ page info="Esempio di direttive"%>
<%@ page language="java" import="java.net.*" %>
<%@ page import="java.util.List, java.util.ArrayList"%>
<%@ include file="myHeaderFile.html" %>
```

## Built-in Objects (con scope differenziati)
Le specifiche JSP definiscono 8 oggetti built-in (o impliciti) utilizzabili senza dover creare istanze. Rappresentano utili riferimenti ai corrispondenti oggetti Java veri e propri presenti nella tecnologia servlet:

| Oggetto | Classe/Interfaccia
-|-|
`page` | `javax.servlet.jsp.HttpJspPage`
`config` | `javax.servlet.ServletConfig`
`request` | `javax.servlet.http.HttpServletRequest`
`response` | `javax.servlet.http.HttpServletResponse`
`out` | `javax.servlet.jsp.JspWriter`
`session` | `javax.servlet.http.HttpSession`
`application` | `javax.servlet.ServletContext`
`pageContext` | `javax.servlet.jsp.PageContext`
`exception` | `Java.lang.Throwable`

<details><summary>Oggetti</summary>

- `page`: L’oggetto `page` rappresenta l’istanza corrente della servlet. Ha come tipo l’interfaccia `HTTPJspPage` che discende da JSP page, la quale a sua volta estende `Servlet`. Può quindi essere utilizzato per accedere a tutti i metodi definiti nelle servlet:
```jsp
<%@ page info=“Esempio di uso page." %>
  <p>Page info:
  <%=page.getServletInfo() %>
  </p>
```
- `config`: Contiene la configurazione della servlet (parametri di inizializzazione). Metodi di `config`: **`getInitParameterName()`** che restituisce tutti i nomi dei parametri di inizializzazione e **`getInitParameter(name)`** che restituisce il valore del parametro passato per nome.
- `request`: È il parametro request passato al metodo `service()` della servlet. Consente l’accesso a tutte le informazioni relative alla richiesta HTTP: indirizzo di provenienza, URL, headers, cookie, parametri, ecc. 
- `response`: Oggetto legato all’I/O della pagina JSP, rappresenta la risposta che viene restituita al client

```jsp
<%response.setDateHeader("Expires", 0);
response.setHeader("Pragma", "no-cache");
if (request.getProtocol().equals("HTTP/1.1")) {
  response.setHeader("Cache-Control", "no-cache");
}
%>
```
- `out`: Oggetto legato all’I/O della pagina JSP. È uno stream di caratteri e rappresenta lo stream di output della pagina. 
- `session`: Oggetto che fornisce informazioni sul contesto di esecuzione della JSP in termini di SESSIONE UTENTE. L’attributo session della direttiva page deve essere true affinché JSP partecipi alla sessione. Metodi di `session`: 
  - `String getID()` restituisce ID di una sessione
  - `boolean isNew()` dice se sessione è nuova
  - `void invalidate()` permette di invalidare (distruggere) una sessione
  - `long getCreationTime()` ci dice da quanto tempo è attiva la sessione (in ms)
  - `long getLastAccessedTime()` ci dice quando è stata utilizzata l’ultima volta.

```jsp
<% UserLogin userData = new UserLogin(name, password);
session.setAttribute("login", userData);
%>
<%UserLogin userData=(UserLogin)session.getAttribute("login");
if (userData.isGroupMember("admin")) {
  session.setMaxInactiveInterval(60*60*8);
} else {
  session.setMaxInactiveInterval(60*15);
}
%>
```
</details>

# Javascript
>JavaScript è un linguaggio di scripting sviluppato per dare interattività alle pagine HTML. Può essere inserito direttamente nelle pagine Web; in pratica è lo standard «client-side» per implementare pagine «dinamiche». Il codice JavaScript viene eseguito da un interprete contenuto all’interno del browser.

**Differenze tra Java e Javascript**

- JavaScript è **interpretato** e **non compilato**
- JavaScript è **object-based** ma **non class-based**
  - Esiste il concetto di oggetto
  - Non esiste il concetto di classe
- JavaScript è **debolmente tipizzato** (weakly typed); Non è necessario definire il tipo di una variabile. Attenzione però: questo non vuol dire che i dati non abbiano un tipo (sono le variabili a non averlo in modo statico)

Le variabili sono definite con la keyword **var**; non hanno un tipo e possono contenere valori di qualsiasi tipo.

Esiste lo **scope globale** e quello **locale** (ovvero dentro una funzione) ma, a differenza di Java, non esiste lo scope di blocco.

Ad ogni variabile può essere assegnato il valore **null** che rappresenta l’assenza di un valore. Una variabile non inizializzata ha invece un valore
indefinito **undefined**. 

**Tipi primitivi**:

Javascript prevede pochi tipi primitivi: **numeri**,
**booleani** e **stringhe**:

**Numeri (number)**:
- Sono rappresentati in formato floating point a 8 byte.
- Non c’è distinzione fra interi e reali
- Esiste il valore speciale **NaN** (not a number) per le operazioni non ammesse (ad esempio, radice di un numero negativo)
- Esiste il valore **infinite** (ad esempio, per la divisione per zero)

**Booleani (boolean)**:

- ammettono i valori **true** e **false**

## Oggetti 
>Gli oggetti sono tipi composti che contengono un certo numero di **proprietà** (attributi).

 Ogni proprietà ha un **nome** e un **valore**; si accede alle proprietà con l’operatore ‘.’ (punto). Le proprietà non sono definite a priori e possono essere aggiunte dinamicamente. Gli oggetti vengono creati usando l’operatore **new**:
 ```javascript
 var o = new Object()
 ```
*Attenzione*: `Object()` è un costruttore e non una classe. Le classi non esistono e quindi i due concetti non si sovrappongono come avviene in Java! 
Un oggetto appena creato è completamente vuoto, non ha ne proprietà né metodi. Possiamo costruirlo dinamicamente appena assegniamo un valore ad una proprietà la proprietà comincia ad esistere.
```javascript
var o = new Object();
o.x = 7;
o.y = 8;
o.tot = o.x + o.y;
```
### Costanti oggetto
Le costanti oggetto (**object literal**) sono racchiuse fra parentesi graffe { } e contengono un elenco di attributi nella forma: `nome:valore`
```javascript
var nomeoggetto = {prop1:val1, prop2:val2, ...}
```

### Array
>Gli array sono tipi composti i cui elementi sono accessibili mediante un indice numerico: l’indice parte da zero e non hanno una dimensione prefissata (simili agli ArrayList di Java).

Espongono attributi e metodi, e vengono istanziati con `new Array([dimensione])`. Possono contenere elementi di tipo eterogeneo: 
```javascript
var b = [1,true,"ciao",{x:1,y:2}];
```

### Oggetti e Array
Gli oggetti in realtà sono **array associativi**: strutture composite i cui elementi sono accessibili mediante un indice di tipo stringa (nome) anziché attraverso un indice numerico. Si può quindi utilizzare anche una sintassi analoga a quella degli array. Le due sintassi sono del tutto equivalenti e si possono mescolare:

<table><tr><td>

```javascript
var o = new Object();
o.x = 7;
o.y = 8;
o.tot = o.x + o.y;
alert(o.tot); 
```
<td><b>=</b></td>
</td><td>

```javascript
var o = new Object();
o["x"] = 7;
o.y = 8;
o["tot"] = o.x + o["y"];
alert(o.tot); 
```
</td></tr></table>

### Stringhe
>Mentre in Java sono oggetti che sembrano dati di tipo primitivo in JavaScript sono dati di tipo **primitivo che sembrano oggetti**. Sono sequenze arbitrarie di caratteri in formato UNICODE a 16 bit e sono immutabili come in Java. Esiste la possibilità di definire costanti stringa (**string literal**) delimitate da apici singoli ('ciao') o doppi ("ciao").

È possibile la concatenazione con l’operatore **+**. È possibile la comparazione con gli operatori **<, >, >=, <=** e **!=**

Possiamo però invocare metodi su una stringa o accedere ai suoi attributi:
```javascript
var s = "Ciao";
var n = s.lenght;
var t = s.charAt(1);
```

**Non sono** però oggetti e la possibilità di trattarli come tali nasce da due caratteristiche:
1.  Esiste un tipo **wrapper** String che è un oggetto
2.  JavaScript fa il boxing in automatico come C# quando una variabile di tipo valore necessita essere convertita in tipo riferimento, un oggetto box è allocato per mantenere tale valore

### Tipi valore e tipi riferimento
Si può quindi distinguere fra tipi valore e tipi
riferimento:
- Numeri e booleani sono tipi valore
- Array e Oggetti sono tipi riferimento

## Funzioni
>Una funzione è un frammento di codice JavaScript che viene definito una volta e usato in più punti. Ammette parametri che sono privi di tipo e restituisce un valore il cui tipo non viene definito.

Le funzioni possono essere definite utilizzando la parola chiave **function**. Una funzione può essere assegnata ad una variabile:
<table><tr><td>

```javascript
function sum(x,y) {
  return x+y;
} 
```
</td><td>

```javascript
var s = sum(2,4);
```
</td></tr></table>

### Costanti funzione e costruttore Function
Esistono **costanti funzione** (function literal) che permettono di definire una funzione e poi di assegnarla ad una variabile con la seguente sintassi:
```javascript
var sum = function(x,y) { return x+y; }
```
Una funzione può essere anche creata usando un costruttore denominato **Function** (le funzioni sono quindi equivalenti in qualche modo agli oggetti):
```javascript
var sum = new Function("x", "y", "return x+y;"); 
```

### Metodi
>Quando una funzione viene assegnata ad una proprietà di un oggetto viene chiamata metodo dell’oggetto. 

La cosa è possibile perché, come abbiamo visto, una funzione può essere assegnata ad una variabile. In questo caso all’interno della funzione si può utilizzare la parola chiave **this** per accedere all’oggetto di cui la funzione è una proprietà:
```javascript
var o = new Object();
o.x = 7;
o.y = 8;
o.tot = function() { return this.x + this.y; }
```

### Costruttori
>Un costruttore è una funzione che ha come scopo quello di costruire un oggetto. Se viene invocato con **new** riceve l’oggetto appena creato e può aggiungere proprietà e metodi.

L’oggetto da costruire è accessibile con la parola chiave **this**. In qualche modo definisce il tipo di un oggetto:

<table><tr><td>

```javascript
function Rectangle(w, h) {
  this.w = w;
  this.h = h;
  this.area = function() { 
    return this.w * this.h; 
  }
  this.perimeter = function() { 
    return 2*(this.w + this.h); 
  }
} 
```
</td><td>

```javascript
var r = new Rectangle(5,4);
alert(r.Area);
```
</td></tr></table>

## Operatori
JavaScript ammette tutti gli operatori presenti in C e in Java. Valgono le stesse regole di priorità e associatività. Esistono alcuni operatori tipici:
- **delete**: elimina una proprietà di un oggetto
- **void**: valuta un’espressione senza restituire alcun valore
- **typeof**: restituisce il valore di un operando
- **===**: identità o uguaglianza stretta (diverso da == che verifica l’eguaglianza)
- **!==**: non identità (diverso da !=)

## Javascript in HTML
HTML prevede un apposito tag per inserire script; la sua sintassi è 
```javascript
<script> 
  <!-- script-text //--> 
</script>
```
Il commento HTML (`<!-- //-->`) che racchiude il testo dello script serve per gestire la compatibilità con i browser che non gestiscono JavaScript: In questi casi il contenuto del tag viene ignorato.

Nell’uso del tag `<script>` abbiamo due possibilità:
1.  **Script esterno**: il tag contiene il riferimento ad un file con estensione .js che contiene lo script:

```javascript
<script language="Javascript" src="nomefile.js"></script>
```
2.  **Script interno**: lo script è contenuto direttamente nel tag:
```javascript
<script type="text/javascript"> 
  alert("Hello World!");
</script>
```

### Browser Objects
Per interagire con la pagina HTML , Javascript utilizza una gerarchia di oggetti predefiniti denominati **Browser Objects** e **DOM Objects**. La pagina corrente è rappresentata dall’oggetto *`document`*. Per scrivere nella pagina si utilizzano i metodi `document.write()` e `document.writeln()`

## Modello ad eventi
>JavaScript consente di **associare script** agli **eventi** causati dall’interazione dell’utente con la pagina HTML. L’associazione avviene mediante attributi collegati agli elementi della pagina HTML. Gli script prendono il nome di gestori di eventi (**event handlers**)

Nelle risposte agli eventi si può intervenire sul DOM modificando dinamicamente la struttura della pagina (DHTML) DHTML = JavaScript + DOM + CSS. È un modello di tipo reattivo simile a quello di Swing o delle applicazioni Windows sviluppate con .NET.

### Tabella riassuntiva eventi

| Evento | Applicabilità | Occorrenza | Event handler |
-|-|-|-|
Abort |Immagini| L’utente blocca il caricamento di un’immagine |onAbort
Blur| Finestre e tutti gli elementi dei form| L’utente oglie il focus a un elemento di un form o a una finestra |onBlur
Change |Campi di immissione di testo o liste di selezione |L’utente cambia il contenuto di un elemento | onChange
Click | Tutti i tipi di bottoni e i link | L’utente ‘clicca’ su un bottone o un link| onClick
DragDrop| Finestre |L’utente fa il drop di un oggetto in una finestra| onDragDrop
Error| Immagini, finestre |Errore durante il caricamento |onError
Focus| Finestre e tutti gli elementi dei form| L’utente dà il focus a un elemento di un form o a una finestra |onFocus
KeyDown| Documenti, immagini, link, campi di immissione di testo |L’utente preme un tasto| onKeyDown
KeyPress| Documenti, immagini, link, campi di immissione di testo |L’utente digita un tasto (pressione + rilascio) | onKeyPress
KeyUp| Documenti, immagini, link, campi di immissione di testo| L’utente rilascia un tasto| onKeyUp
Load| Corpo del documento |L’utente carica una pagina nel browser| onLoad
MouseDown| Documenti, bottoni, link| L’utente preme il bottone del mouse |onMouseDown
MouseMove| Di default nessun elemento |L’utente muove il cursore del mouse | onMouseMove
MouseOut| Mappe, link| Il cursore del mouse esce fuori da un link o da una mappa| onMouseOut|
MouseOver| Link| Il cursore passa su un link| onMouseOver
MouseUp| Documenti, bottoni, link| L’utente rilascia il bottone del mouse| onMouseUp
Move| Windows| La finestra viene spostata |onMove
Reset| Form| L’utente resetta un form| onReset
Resize| Finestre | La finestra viene ridimensionata onResize
Select| Campi di immissione di testo (input e textarea)| L’utente seleziona il campo |onSelect
Submit| Form| L’utente sottomette il form |onSubmit
Unload| Corpo del documento |L’utente esce dalla pagina| onUnload

### Gestori di evento (event handlers)
Come si è detto, per «agganciare» un gestore di evento ad un evento si utilizzano gli attributi degli elementi HTML. La sintassi è:
```javascript
<tag eventHandler="JavaScript Code">
```
Esempio:
```javascript
<input type="button" value="Calculate" onClick=‘alert("Calcolo")’/>
```
È possibile inserire più istruzioni in sequenza, ma è meglio definire delle funzioni (in testata)! È sempre necessario alternare doppi apici e apice singolo:
```javascript 
<input type="button" value="Apriti sesamo!" onClick="window.open('myDoc.html', 'newWin')">
```

## DOM
Il punto di partenza per accedere al Documento Object Model (DOM) della pagina è l’oggetto document. Document espone 4 collezioni di oggetti che rappresentano gli elementi di primo livello: 
- anchors[]
- forms[]
- images[]
- links[]

L’accesso agli elementi delle collezioni può avvenire per indice (ordine di definizione nella pagina) o per nome (attributo name dell’elemento): 
```javascript
document.links[0]
document.links["nomelink"]
```
In base all’equivalenza tra array associativi e oggetti la seconda forma può essere scritta anche come 
```javascript
document.nomelink
```

<details><summary>Metodi:</summary>

- **getElementById()**: restituisce un riferimento al primo oggetto della pagina avente l’id specificato come argomento
- **write()**: scrive un pezzo di testo nel documento
- **writeln()**: come write() ma aggiunge un a capo

</details>
<details><summary>Proprietà</summary>

- bgcolor: colore di sfondo
- fgcolor: colore di primo piano
- lastModified: data e ora di ultima modifica
- cookie: tutti i cookies associati al document
- rappresentati da una stringa di coppie: nome-valore
- title: titolo del documento
- URL: url del documento

</details>

### Form
Un oggetto form può essere referenziato con il suo nome o mediante il vettore **forms[]** esposto da *document*: 
```javascript
document.nomeForm
document.forms[n]
document.forms["nomeForm"]
```
Gli **elementi** del form possono essere referenziati con il loro nome o mediante il vettore *elements[]*:
```javascript
document.nomeForm.nomeElemento
document.forms[n].elements[m]
document.forms["nomeForm"].elements["nomeElem"]
```
Per ogni elemento del form esistono proprietà corrispondenti ai vari attributi:
`id, name, value, type, className`

<details><summary>Proprietà</summary>

- **action**: riflette l’attributo action
- **elements**: vettore contenente gli elementi della form
- **length**: numero di elementi nella form
- **method**: riflette l’attributo method
- **name**: nome del form
- **target**: riflette l’attributo target
</details>

<details><summary>Metodi</summary>

- **reset()**: resetta il form
- **submit()**: esegue il submit
</details>

<details><summary>Eventi</summary>

- **onreset**:  quando il form viene resettato
- **onsubmit**: quando viene eseguito il submit del form

</details>
<details><summary>Controlli del form</summary>

Ogni tipo di controllo (widget) che può entrare a far parte di un form è rappresentato da un oggetto JavaScript:
- Text: `<input type =“text”>`
- Checkbox: `<input type=“checkbox”>`
- Radio: `<input type=“radio”>`
- Button: `<input type=“button”> o <button>`
- Hidden: `<input type=“hidden”>`
- File: `<input type=“file”>`
- Password: `<input type=“password”>`
- Textarea: `<textarea>`
- Submit: `<input type=“submit”>`
- Reset: `<input type=“reset”>` 
</details>

#### Text
<details><summary>Proprietà (get/set)</summary>

- **defaultValue** valore di default
- **Disabled** disabilitazione / abilitazione del campo
- **maxLength** numero massimo di caratteri
- **readOnly** sola lettura / lettura e scrittura
- **size** dimensione del controllo
</details>

<details><summary>Metodi</summary>

- **select()** seleziona una parte di testo
</details>

#### Validazione form
Generalmente si valida un form in due momenti:
1.  Durante **l’inserimento** utilizzando l’evento **onChange()** sui vari controlli
2.  Al momento del **submit** utilizzando l’evento **onClick()** del bottone di submit o l’evento **onSubmit()** del form

<details><summary>Esempio di validazione</summary>

```javascript
<head>
  <script type="text/javascript">
    function qty_check(item, min, max) {
      returnVal = false;
      if (parseInt(item.value) < min) or (parseInt(item.value) > max) 
        alert(item.name+"deve essere fra "+min+" e "+max);
      else returnVal = true;
      return returnVal;
    }
    function validateAndSubmit(theForm) {
      if (qty_check(theform.quantità,0,999)) { 
        alert("Ordine accettato"); 
        return true; 
      }
      else { 
        alert("Ordine rifiutato");
        return false; 
      }
    }
  </script>
</head>
```
```javascript
<body>
  <form name="widget_order" action="lwapp.html" method="post"> Quantità da ordinare
    <input type="text" name="quantità" onchange=“return qty_check(this,0,999)">
    <br/>
    <input type="submit" value="Trasmetti l’ordine"  onclick=“return validateAndSubmit(this.form)">
  </form>
</body>
```
```javascript
<form name="widget_order" action="lwapp.html" method="post" onSubmit="return qty_check(this.quantita,0,999)">
  ...
  <input type="submit" />
  ...
</form>
```
</details>

# AJAX
L’utilizzo di **DHTML** (JavaScript/Eventi + DOM + CSS) delinea un nuovo modello per applicazioni Web. Modello a eventi simile a quello delle applicazioni tradizionali.

A livello concettuale abbiamo però due livelli di eventi: 
- **Eventi locali** che portano ad una modifica diretta DOM da parte di Javascript e quindi a cambiamento locale della pagina
- **Eventi remoti** ottenuti tramite ricaricamento della pagina che viene modificata lato server in base ai parametri passati in GET o POST 

>Il ricaricamento di pagina per rispondere a  interazione con l’utente prende il nome di **postback**.

**AJAX** non è un acronimo ma spesso viene interpretato come **Asynchronous Javascript And Xml**.
AJAX non è una nuova tecnologia per se ma è basato su tecnologie standard (già viste all’interno del corso) e combinate insieme per realizzare un modello di interazione più ricco.

AJAX punta a supportare applicazioni user friendly con elevata interattività (si usa spesso il termine RIA - **Rich Interface Application**). L’idea alla base di AJAX è quella di consentire agli script JavaScript di interagire direttamente con il server.

L’elemento centrale è l’utilizzo dell’oggetto JavaScript **XMLHttpRequest**. Consente di ottenere dati dal server senza necessità di ricaricare l’intera pagina. Realizza comunicazione **asincrona** fra client e server: il client non interrompe interazione con utente anche quando è in attesa di risposte dal server.

## Tipica sequenza AJAX
- Si verifica un evento determinato dall’interazione fra utente e pagina Web
- L’evento comporta l’esecuzione di una funzione JavaScript in cui:
  - Si istanzia un oggetto di classe **XMLHttpRequest**
  - Si configura XMLHttpRequest: si associa una funzione di **callback**, si effettua configurazione, ...
  - Si effettua chiamata asincrona al server
- Il server elabora la richiesta e risponde al client
- Il browser invoca la funzione di callback che:
- Elabora il risultato
- Aggiorna il DOM della pagina per mostrare i risultati
dell’elaborazione

È l’oggetto **XMLHttpRequest** che effettua richiesta di una risorsa via HTTP a server Web. NON sostituisce URI della propria richiesta all’URI corrente; NON provoca cambio di pagina. Può inviare info (parametri) sotto forma di variabili (come form).

Può effettuare sia richieste **GET** che **POST**. Le richieste possono essere di tipo:
- **Sincrono**: blocca flusso di esecuzione del codice Javascript (ci interessa poco)
- **Asincrono**: NON interrompe il flusso di esecuzione
del codice Javascript né le operazioni dell'utente
sulla pagina

I browser recenti supportano **XMLHttpRequest** come oggetto nativo: In questo caso (oggi il più comune) le cose sono molto semplici:
```javascript
var xhr = new XMLHttpRequest();
```
La lista dei metodi disponibili è diversa da browser a browser. In genere si usano solo quelli presenti in Safari (sottoinsieme più limitato, ma comune a tutti i browser che supportano AJAX):
<details><summary>Metodi</summary>

- **`open()`** ha lo scopo di inizializzare la richiesta da formulare al server. Lo standard W3C prevede 5 parametri, di cui 3 opzionali: **`open (method, uri [,async][,user][,password])`**. L’uso più comune per AJAX ne prevede 3, di cui uno comunemente fissato: **`open (method, uri, true)`**, dove:
  - **method**: stringa e assume il valore “get” o “post”
  - **uri**: stringa che identifica la risorsa da ottenere (URL assoluto o relativo)
  - **async**: valore booleano che deve essere impostato come true per indicare al metodo che la richiesta da effettuare è di tipo asincrono
- **`setRequestHeader(nomeheader, valore)`**: consente di impostare gli header HTTP della richiesta da inviare. Viene invocata più volte, una per ogni header da impostare. Per una richiesta GET gli header sono opzionali .Sono invece necessari per impostare codifica utilizzata nelle richieste POST. È comunque importante impostare header **connection** di solito al valore **close**.
- **`send(body)`**: consente di inviare la richiesta al server. Non è bloccante in attesa di risposta se il parametro async di open è stato impostato a *true*. Prende come parametro una stringa che costituisce il body della richiesta HTTP.
  
**GET**
```javascript
var xhr = new XMLHttpRequest();
xhr.open("get", "pagina.html?p1=v1&p2=v2", true );
xhr.setRequestHeader("connection", "close");
xhr.send(null);
```
**POST**
```javascript
var xhr = new XMLHttpRequest();
xhr.open("POST", "pagina.html", true );
xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
xhr.setRequestHeader("connection", "close");
xhr.send("p1=v1&p2=v2");
```
- **`getResponseHeader()`** e **`getAllResponseHeader()`**: Consentono di leggere gli header HTTP che descrivono la risposta del server. Sono utilizzabili solo nella funzione di callback. Possono essere invocati sicuramente in modo safe solo a richiesta conclusa `(readystate==4)`. In alcuni browser possono essere invocati anche in fase di ricezione della risposta `(readystate==3)`.
- **`abort()`**: consente l’interruzione delle operazioni di invio o ricezione. Non ha bisogno di parametri. Termina immediatamente la trasmissione dati. *Attenzione*: non ha senso invocarlo dentro la funzione di callback: se readyState non cambia, il metodo non viene richiamato; readyState non cambia quando la risposta si fa attendere. Si crea un’altra funzione da far richiamare in modo asincrono al sistema mediante il metodo **`setTimeOut(funzioneAsincronaPerAbortire,timeOut)`**. Al suo interno si valuta se continuare l’attesa o
abortire l’operazione.
</details>

## Proprietà di XMLHttpRequest
Stato e risultati della richiesta vengono memorizzati dall’interprete Javascript all’interno dell’oggetto XmlHttpRequest durante la sua esecuzione. Le proprietà comunemente supportate dai vari browser sono:
- **readyState**
- **onreadystatechange**
- **status**
- **statusText**
- **responseText****`setTimeOut(funzioneAsincronaPerAbortire,timeOut)`**
- **responseXML**

## Proprietà ReadyState
Proprietà in sola lettura di tipo intero che consente di leggere in ogni momento lo stato della richiesta. Ammette 5 valori:
1.  **uninitialized** - l'oggetto esiste, ma non è stato ancora richiamato open()
2.  **open** - è stato invocato il metodo open(), ma send() non ha ancora effettuato l'invio dati
3. **sent** - metodo send() è stato eseguito e ha effettuato la richiesta
4.  **receiving** – la risposta ha cominciato ad arrivare
5.  **loaded** - l'operazione è stata completata

**Attenzione**:
Questo ordine non è sempre identico e non è sfruttabile allo stesso modo su tutti i browser. L'unico stato supportato da tutti i browser è il 4. Come si è detto l'esecuzione del codice non si blocca sulla send() in attesa dei risultati. Per gestire la risposta si deve quindi adottare un approccio a eventi. Occorre registrare una funzione di callback che viene richiamata in modo asincrono ad ogni cambio di stato della proprietà ReadyState. La sintassi è:
```javascript
xhr.onreadystatechange = nomefunzione
xhr.onreadystatechange = function(){istruzioni}
```
## Proprietà status e statusText
**status** contiene un valore intero corrispondente al codice HTTP dell’esito della richiesta:
- 200 in caso di successo (l’unico in base al quale i dati ricevuti in risposta possono essere ritenuti corretti e significativi)
- Possibili altri valori (in particolare d’errore: 403, 404, 500, …) 
   
**statusText** contiene invece una descrizione testuale del codice HTTP restituito dal server. Esempio:
```javascript
if (xhr.status != 200)
  alert(xhr.statusText);
```

## Proprietà responseText
Contengono i dati restituiti dal server.
- **responseText**: stringa che contiene il body della risposta HTTP. Disponibile solo a interazione ultimata `(readystate==4)`
- **responseXML**: body della risposta convertito in documento XML (se possibile). Consente la navigazione via Javascript. Può essere **null** se i dati restituiti non sono un documento XML ben formato.

## Callback
Viene invocata ad ogni variazione di **readystate**. Usa **readystate** per leggere lo stato di avanzamento della richiesta. Usa **status** per verificare l’esito della richiesta. Ha accesso agli header di risposta rilasciati dal server con `getAllResponseHeaders()` e `getResponseHeader()`. Se `readystate==4` può leggere il contenuto della risposta con *responseText* e *responseXML*.

## Esempio AJAX
```html
<html>
  <head>
    <script src="selectmanager_xml.js"></script>
  </head>
  <body>
    <!-- Lista di selezione -->
    <form action=""> Scegli un contatto:
      <select name=”manager“ onchange="showManager(this.value)">
        <option value=”Carlo11">Carlo Rossi</option>
        <option value=”Anna23">Anna Bianchi</option>
        <option value=”Giovanni75">Giovanni Verdi</option>
      </select>
    </form>
    <!-- Area in cui mostrare i risultati -->
    <b><span id="companyname"></span></b><br/>
    <span id="contactname"></span><br/>
    <span id="address"></span>
    <span id="city"></span><br/>
    <span id="country"></span>
  </body>
</html>
```

Ipotizziamo che i dati sui contatti siano contenuti in un database. Il server:
- riceve una request con l’identificativo della persona
- interroga il database
- restituisce un file XML con i dati richiesti
```xml
<?xml version=‘1.0’ encoding=‘UTF-16’?>
<company>
  <compname>Microsoft</compname>
  <contname>Anna Bianchi</contname>
  <address>Viale Risorgimento 2</address>
  <city>Bologna</city>
  <country>Italy</country>
</company>
```

**selectmanager_xml.js**
```javascript
var xmlHttp;
function showManager(str) { 
  xmlHttp=new XMLHttpRequest();
  var url="getmanager_xml.jsp?q="+str;
  xmlHttp.onreadystatechange=stateChanged;
  xmlHttp.open("GET",url,true);
  xmlHttp.send(null);
}
function stateChanged(){ 
  if (xmlHttp.readyState==4) {
    var xmlDoc=xmlHttp.responseXML.documentElement;
    var compEl=xmlDoc.getElementsByTagName("compname")[0];
    var comName = compEl.childNodes[0].nodeValue;
    document.getElementById("companyname").innerHTML=
    compName;
    //...
  }
}
```

## JSON
>JSON è l’acronimo di JavaScript Object Notation. Formato per lo scambio di dati, considerato molto più comodo di XML.

Si basa sulla notazione usata per le costanti oggetto (object literal) e le costanti array (array literal) in JavaScript. In Javascript è possibile creare un oggetto in base a una costante oggetto:
<table><tr><td>

```javascript
var Beatles =
{
  "Paese" : "Inghilterra",
  "AnnoFormazione" : 1959,
  "TipoMusica" : "Rock"
} 
```
</td><td>=</td><td>

```javascript
var Beatles = new Object();
Beatles.Paese = "England";
Beatles.AnnoFormazione = 1959;
Beatles.TipoMusica = "Rock"; 
```
</td></tr></table>
In modo analogo è possibile creare un array utilizzando una costante di tipo array:

<table><tr><td>

```javascript
var Membri = ["Paul","John","George","Ringo"];
```
</td><td>

```javascript
var Membri = new Array("Paul","John","George","Ringo");
```
</td></tr></table>
Possiamo anche avere oggetti che contengono array:

```javascript
var Beatles = {
  “Paese" : “Inghilterra",
  “AnnoFormazione" : 1959,
  “TipoMusica" : "Rock",
  "Membri" : ["Paul", "John", "George", "Ringo"]
}
```
È infine possibile definire array di oggetti:
```javascript
var Rockbands = 
[
  {
    "Nome" : "Beatles",
    “Paese" : “Inghilterra",
    “AnnoFormazione" : 1959,
    “TipoMusica" : "Rock",
    "Membri" : ["Paul","John","George","Ringo"]
  },
  {
    "Nome" : "Rolling Stones",
    “Paese" : “Inghilterra",
    “AnnoFormazione" : 1962,
    “TipoMusica" : "Rock",
    "Membri" : ["Mick","Keith","Charlie","Bill"]
  }
]
```
La sintassi JSON si basa su quella delle costanti oggetto e array di JavaScript. Un “oggetto JSON” altro non è che una stringa equivalente a una costante oggetto di JavaScript:
```json
'{"Paese" : "Inghilterra", "AnnoFormazione" :
1959, "TipoMusica" : "Rock'n'Roll", "Membri" :
["Paul","John","George","Ringo"] }'
```
### Parser JSON
Di solito si preferisce utilizzare parser appositi che traducono solo oggetti JSON e non espressioni JavaScript di qualunque tipo. Il parser espone l’oggetto JSON con due metodi:
1.  **`JSON.parse(strJSON)`**: converte una stringa JSON in un oggetto JavaScript 
2.  **`JSON.stringify(objJSON)`**: converte un oggetto JavaScript in una stringa JSON

### JSON e AJAX
Ad esempio in una interazione client-server in cui il cliente vuole trasferire un oggetto JSON. 

| Lato Client | Lato Server
|-|-|
Sul lato client: Si crea un oggetto JavaScript e si riempiono le sue proprietà con le informazioni necessarie. Si usa **`JSON.stringify()`** per convertire l’oggetto in stringa JSON. Si usa la funzione **`encodeURIComponent()`** per convertire la stringa in un formato utilizzabile in una richiesta HTTP. Si manda la stringa al server mediante **XMLHttpRequest** (stringa viene passata comevariabile con GET o POST) | Si decodifica la stringa JSON e la si trasforma in oggetto Java utilizzando un apposito parser. Si elabora l’oggetto. Si crea un nuovo oggetto Java che contiene dati della risposta. Si trasforma l’oggetto Java in stringa JSON usando il parser suddetto. Si trasmette la stringa JSON al client nel corpo della risposta HTTP: **`response.out.write(strJSON)`**;
Sul lato client, all’atto della ricezione: Si converte la stringa JSON in un oggetto Javascript usando **`JSON.parse()`**. Si usa liberamente l’oggetto per gli scopi desiderati. | 

# JDBC e accesso diretto al DB
> Il mapping Object/Relational si occupa di risolvere il potenziale mismatch fra dati mantenuti in un DB relazionale (table-driven) e il loro processamento fatto da oggetti in esecuzione.

**Accesso diretto alle basi di dati**: 

È possibile (ed è di gran lunga l’accesso a DB più tipico) inserire istruzioni SQL direttamente nel codice di un’applicazione scritta in un linguaggio di programmazione. (Esempio: Java JDBC)

Il problema da risolvere è relativo all’integrazione tra i comandi SQL, i quali sono responsabili di realizzare l’accesso al DB, e le normali istruzioni del linguaggio di programmazione.

Due soluzioni possibili:

- **SQL Embedded** o “incastonamento”: SQL viene integrato direttamente all’interno del normale linguaggio di programmazione distinguendolo dalle normali istruzioni tramite un opportuno separatore.   
  - **Cursori**: strumento che permette a un programma di accedere alle righe di una tabella una alla volta; viene definito su una generica interrogazione.
  - **SQL dinamico**: permette all’applicazione di definire al momento dell’esecuzione le interrogazioni SQL da effettuare sulla base di dati.
- **Call Level Interface (CLI)**: l’integrazione con SQL avviene tramite l’invocazione di una opportuna libreria di funzioni che permettono di interagire direttamente con il DBMS. (Esempio: JDBC). Rispetto a SQL Embedded, CLI rappresenta uno strumento più flessibile e meglio integrato con il linguaggio di programmazione, anche se bisogna gestire esplicitamente degli aspetti che con SQL embedded sono demandati al preprocessore SQL.

### Utilizzo generale CLI
Una applicazione che accede (in lettura e/o scrittura) ad una sorgente di dati ha bisogno di fare le seguenti operazioni:
1. Aprire una connessione alla sorgente dati
2. Inviare attraverso la connessione istruzioni (di interrogazione e aggiornamento) alla sorgente dati
3. Processare i risultati ricevuti dalla sorgente dati in risposta alle istruzioni inviate

Ogni DBMS espone una **API** (Application Program Interface) con cui le le applicazioni possono interagire, comunicando con il DBMS attraverso un **driver**.

## ODBC e JDBC
> **ODBC**: acronimo di Open Database Connectivity. È un API standard definita da Microsoft nel 1992 che permette l’accesso a dati residenti in DB relazionali in un contesto eterogeneo e distribuito (diversi DBMS: Access, MySQL, DB2, Oracle...)

Permette ai programmatori di formulare richieste SQL che accederanno a dati relativi a DB distinti senza dover conoscere le interfacce proprietarie di ogni singolo DB.
>**JDBC**: API Java standard definita da Sun Microsystems nel 1996. Rappresenta la controparte Java di ODBC che permette di accedere ai database (locali e remoti) in modo uniforme.

Garantisce accesso ai database in modo indipendente dalla piattaforma. I driver JDBC sono collezioni di classi Java che implementano metodi definiti dalle specifiche JDBC.

### JDBC Driver Manager e Driver
>**JDBC Driver Manager**: Rappresenta il livello di gestione di JDBC e opera tra l’utente e i driver. Tiene traccia dei driver disponibili e gestisce la creazione di una connessione tra un DB e il driver appropriato. 

>**Driver**: JDBC è un insieme di interfacce; per usare un’interfaccia è necessario fornire un’implementazione per tutti i metodi che la compongono. L’insieme delle classi Java che implementano le interfacce JDBC rappresentano un modulo software chiamato driver JDBC. Ogni DBMS ha il proprio driver rilasciato dal produttore o sviluppato da terze parti. Sono i driver che realizzano la vera comunicazione con il DB. 

I Driver possono essere divisi in due categorie:

1.  **2-tier**: client colloquiano direttamente con DB. L’applicazione interagisce direttamente con il DB mediante un opportuno protocollo di rete, per es. TCP/IP (caso driver JDBC middleware, detto anche Net-Driver), oppure mediante un protocollo di rete proprietario (caso driver JDBC Driver). Si appoggia su un ambiente completamente Java.
2.  **3-tier**: client comunicano con un middle-tier che accede al DB. Affinché l’applicazione possa interagire con il DB occorre che le chiamate JDBC siano convertite in chiamate API native (caso JDBC/native bridge) o in chiamate ODBC (caso JDBC/ODBC bridge). Non è realmente **portabile** in quanto richiede l’utilizzo di componenti **nativi**. 

Esistono quattro tipi di driver:

1.  **Ponte JDBC-ODBC Driver**: prestazioni scadenti, non indipendente dalla piattaforma, fornito a corredo di JDK.
2.  **Ponte JDBC-Native Driver**: migliori prestazioni, non indipendente dalla piattaforma
3.  **Driver Java Puro per Accesso a DB via Middleware**: client indipendente dalla piattaforma, servizi avanzati (caching) ma architettura complessa
4.  **Driver Java Puro per Accesso Diretto a DB**: client indipendente dalla piattaforma, buone prestazioni

## Uso di JDBC

Accesso a DB con JDBC consiste nel:
- Caricare la classe del driver JDBC
- Ottenere una connessione dal driver
- Eseguire statement SQL
- Utilizzare risultati delle query
- Chiudere la connessione e rilasciare strutture dati utilizzate
- Per la gestione del dialogo con il DB

```java
Class.forName(“com.ibm.db2.jcc.DB2Driver").newInstance();
Connection conn = DriverManager.getConnection("jdbc:db2:MYDB");
Statement stm = conn.createStatement();
ResultSet res = stm.executeQuery("SELECT * FROM MYTABLE");
while (res.next()) {
  String col1 = res.getString("MYCOL1");
  int col2 = res.getInt("MYCOL2");
}
```

### Interfaccia Driver
>Rappresenta il punto di partenza per ottenere una connessione a un DBMS. La classe che implementa Driver può essere considerata la “factory” per altri oggetti JDBC: ad esempio, oggetti di tipo Connection.

È possibile ottenere un’istanza effettiva della classe `Driver` ricercando la classe con il metodo **`forName`**:

```java
Driver d = Class.forName(“com.ibm.db2.jcc.DB2Driver”).newInstance();
```

### Interfaccia Connection
>Un oggetto di tipo `Connection` rappresenta una connessione attiva con il DB. 

L’interfaccia mette a disposizione una serie di metodi per le operazioni, tra le quali la preparazione di query SQL da inviare tramite oggetti: `Statement`, `Prepared Statement`, `Callable Statement`.

### Interfaccia Statement
>Gli oggetti di tipo `Statement` possono essere usati per inviare query SQL semplici verso il DBMS sottostante. 

Per query di tipo **SELECT** il risultato è inserito in un oggetto `ResultSet`. Un oggetto `Statement` può essere creato con il metodo `createStatement` di `Connection`.

### Interfaccia Prepared Statement
>Gli oggetti di tipo `PreparedStatement` possono essere usati per creare **query SQL parametriche** (parametri di tipo IN) e **precompilate** (“prepared”).

Il valore di ciascun parametro non è specificato nel momento in cui lo statement SQL è definito, ma rimpiazzato dal carattere '**?**'. È più efficiente perché una volta che la query è preparata, sarà pre-compilata per usi futuri.

### Interfaccia Callable Statement
>Gli oggetti di tipo `CallableStatement` possono essere usati per definire query parametriche con parametri di tipo **IN**, **OUT** e **INOUT**. Permettono di eseguire una invocazione a una **stored procedure** memorizzata sul server DB.

### Interfaccia ResultSet
>L’oggetto ResultSet è il risultato di una query di selezione (**SELECT**).Rappresenta una tabella composta da righe (gli elementi selezionati) e colonne (gli attributi richiesti).

### Oggetto Statement
Un oggetto `Statement` fornisce tre metodi per
eseguire una query SQL:
- (StatementObj.) **`executeQuery`(stmt SQL)**, per statement che generano un unico `ResultSet` (SELECT)
- (StatementObj.) **`executeUpdate`(stmt SQL)**, per statement di modifica (UPDATE, INSERT, ecc.)
- (StatementObj.) **`execute`(stmt SQL)**, per statement che generano più di un risultato o più di un contatore di aggiornamento 

### Oggetto PreparedStatement
>Usato quando la query SQL prende uno o più parametri come input, o quando una query semplice deve essere eseguita più volte. L’interfaccia PreparedStatement estende l’interfaccia `Statement` ereditandone tutte le funzionalità. In più sono presenti metodi per la gestione dei parametri. I parametri vengono poi settati mediante il metodo (StatementObj.) **`setXXX(n,value)`**. La query pre-compilata viene eseguita mediante i metodi `executeQuery()`, `executeUpdate()` o `execute()` senza bisogno di passare alcun parametro!

Esempio: 
```java
PreparedStatement ps = con.prepareStatement("UPDATE MyTable SET a = ? WHERE b = ?");
```
Per istanziare i parametri “**?**” (necessariamente prima dell’esecuzione):
```java
ps.setInt(1, 20);
ps.setInt(2,100);
```

### Mapping tipi JAVA - SQL 

| SQL | JAVA |
-|-
CHAR |  String
VARCHAR | String
LONGVARCHAR| String
NUMERIC| `java.math.BigDecimal`
DECIMAL| `java.math.BigDecimal`
BIT| boolean
TINYINT| byte
SMALLINT| short
INTEGER| int
BIGINT| long
REAL| float
FLOAT| double
DOUBLE| double 
BINARY| byte[]
VARBINARY| byte[]
LONGVARBINARY| byte[]
DATE| `java.sql.date`
TIME| `java.sql.Time`
TIMESTAMP| `java.sql.Timestamp`

## Esempio di applicazione JDBC
1.  **Importazione dei package**:
```java
import java.sql.*; //package JDBC
```
2.  **Registrazione Driver JDC**:
```java
class Esempio {
  public static void main(String argv[]) {
  try {
    // caricamento e registrazione driver
    Class.forName(“com.ibm.db2.jcc.DB2Driver").newInstance();
```
3.  **Apertura connessione DB**:
```java
Connection con = null;
// URL jdbc:db2:database_alias
String url = "jdbc:db2://diva.disi.unibo.it:50000/sample";
if (argv.length == 2) {
  String userid = argv[0];
  String passwd = argv[1];
  // connessione con id/passwd forniti dall’utente
  con = DriverManager.getConnection(url, userid, passwd);
}
else {
  System.out.println("\nUsage: java Esempio username password\n");  
  System.exit(0);
}
```
4.  **Creazione oggetto `Statement`**:
```java
// interrogazione table EMPLOYEE 
System.out.println("Retrieve some data from the database");
Statement stmt = con.createStatement();
```
5. **Esecuzione query** 6. **Utilizzo oggetto `ResultSet`**   
```java
ResultSet rs = stmt.executeQuery("SELECT * FROM DB2INST1.EMPLOYEE");
System.out.println("Received results:");
// mostra i risultati
// rs.next() = “false” se non ci sono più righe risultato
while (rs.next()) {
  String number = rs.getString(1);
  String name = rs.getString(2);
  System.out.print(" empno= " + number);
  System.out.print(" firstname= " + name);
  System.out.print("\n");
}
```
7.  **Chiusura oggetti ResultSet e Statement**
```java
rs.close();
stmt.close();
// Esecuzione di altre istruzioni SQL
// aggiorna il database… prova ad aggiornarlo! 
System.out.println("\n\nUpdate the database... ");
stmt = con.createStatement();
int rowsUpdated = stmt.executeUpdate("UPDATE DB2INST1.EMPLOYEE SET firstname = 'SHILI’ WHERE empno = '000010'");
System.out.print("Changed "+rowsUpdated);
if (1 == rowsUpdated) 
  System.out.println(" row.");
else 
  System.out.println(" rows.");
stmt.close(); // chiude Statement
```
8. **Chiusura connessione**:
```java
// chiude Connection
  con.close();
    } // try
    catch( Exception e ) {
      e.printStackTrace();
    }
  } // main
} // classe
```

## SQL Injection
È una tecnica che sfrutta la vulnerabilità a livello di sicurezza dello strato DB di una applicazione. Tale vulnerabilità è presente quando i dati di input
dell’utente sono: 
- Filtrati in modo incorretto per la verifica di caratteri literal escape nelle stringhe
- Non sono fortemente “tipizzati” e/o controllati i vincoli di tipo.

Per proteggere le nostre applicazioni dall’SQL injection, i dati di input dell’utente NON devono essere direttamente incastonati all’interno di Statement SQL. A prevenzione del problema, l’interfaccia
**`PreparedStatement`** permette di gestire in modo
corretto anche l’inserimenti di dati “ostili”.

## Connection Pool e DataSource
>I **`Connection Pool`** sono oggetti, amministrati dall’application server, preposti a gestire connessioni verso DB. 

Sono configurabili attraverso opportuni file. Il vantaggio principale nell’utilizzo di `ConnectionPool` risiede nel fatto che **le connessioni sono esistenti quando l’applicazione necessita di connettersi a DB**, eliminando quindi overhead dovuto alla creazione delle connessioni ad ogni richiesta. L'application server può applicare un **bilanciamento di carico** alle applicazioni che usano DB, assegnando o rilasciando connessioni alle applicazioni in dipendenza dalle loro necessità (**connection pooling**). Il bilanciamento può anche includere un incremento o riduzione del numero di connessioni nel pool al fine di adattarlo al cambiamento delle condizioni di carico.

>I **`DataSource`** sono factory di connessioni verso sorgenti dati fisiche rappresentate da oggetti di tipo `javax.sql.DataSource`.

Oggetti di tipo `DataSource` vengono pubblicati su JNDI e vengono creati sulla base di una configurazione contenuta in un descrittore (es. web.xml). `DataSource` fa da **wrapper per il concetto di connection pool**.

# Metodologie di Progettazione della Persistenza: Approccio “forza bruta”, Pattern DAO,  Framework ORM e Hibernate

## Conflitto di impedenza
>Definito anche come “*disaccoppiamento di impedenza*” (o impedance mismatch) tra base di dati e linguaggio. 

| | Linguaggi | SQL |
-|-|-|
**Impedance mismatch**: | operazioni su singole variabili o oggetti | operazioni su relazioni (insiemi di ennuple)
**Differenze di accesso ai dati e correlazione** | dipende dal paradigma e dai tipi disponibili; ad esempio scansione di liste o “navigazione” tra oggetti | join (ottimizzabile)
**Differenze sui tipi di dato primitivi** | numeri, stringhe, booleani etc... | CHAR, VARCHAR, DATE, ETC...
**Differenze sui costruttori di tipo** | dipende dal paradigma | relazioni e ennuple

In più:
- **OID** (trasparenti al programmatore) vs. chiavi primarie (visibili e manipolabili)
- Riferimenti vs. chiavi esterne
- **Ereditarietà** (senza controparte nel mondo relazionale)

Dal modello concettuale si può derivare (una prima
versione di):
1.  Classi che implementano la **logica applicativa** (diciamo che queste classi implementano il **modello di dominio**, o più semplicemente il modello).
2.  Classi facade che offrono le operazioni (metodi) dell’applicazione.
3.  Schema relazionale per memorizzare i dati.  


## Brute force 
>È la tecnica più semplice per gestire la persistenza. C'è un forte accoppiamento con la sorgente dati. Consiste nello scrivere dentro le classi del modello un insieme di metodi che implementano le operazioni CRUD.

**CRUD**:
- **Create**: inserimento di una tupla (che rappresenta un oggetto) nel database (INSERT)
- **Retrieve**: ricerca di una tupla secondo un qualche criterio di ricerca (SELECT)
- **Update**: aggiornamento di una tupla nel database (UPDATE)
- **Delete**: eliminazione di una tupla nel database (DELETE)

Per ogni classe `MyC` che rappresenta una entità del dominio, si definiscono:
- un metodo **`doRetrieveByKey(X key)`** che restituisca un oggetto istanza di `MyC` i cui dati sono letti dal database, tipicamente da una tabella che è stata derivata dalla stessa classe del modello di dominio che ha dato origine a `MyC`. Recupera i dati per chiave.
- un metodo **`saveOrUpdate(...)`** che salva i dati dell'oggetto corrente nel database. Il metodo esegue una istruzione SQL update o insert a seconda che l'oggetto corrente esista già o meno nel database.
- uno o più metodi **`doRetrieveByCond(...)`** che restituiscono una collezione di oggetti istanza della classe `MyC` che soddisfano una qualche condizione (basata sui parametri del metodo)
- un metodo **`doDelete(...)`** che cancella dal database i dati dell'oggetto corrente.

## Pattern DAO (Data Access Object)
La soluzione Forza bruta non è particolarmente conveniente poichè l'accoppiamento tra la sorgente dati e le classi del modello è molto forte.
Una soluzione "*naturale*" è quella di affidare le responsabilità di interagire con il database ad opportune classi. 
>Il pattern DAO è uno degli standard “J2EE design patterns”; rappresenta un possibile modo di separare: logica di **business** (es: Servlet, JSP, ...) a logica di **persistenza** (es: r/w su DB, ...). Solo gli oggetti previsti dal pattern DAO hanno il permesso di “vedere” il DB ed espongono metodi di accesso per tutti gli altri componenti.

I valori scambiati tra DB e il resto dell’applicazione sono racchiusi in oggetti detti **Data Transfer Object (DTO)** composti da:
- campi privati per contenere i dati da leggere/scrivere su db
- metodi getter e setter per accedere dall’esterno a tali campi
- metodi di utilità (confronto, stampa, etc...)

Le operazioni che coinvolgono tali oggetti sono raggruppati in interfacce che definiscono i Data Access Object (DAO) disponibili: metodi CRUD ed altri. Le implementazioni di tali interfacce (spesso indicate come oggetti DAO, per brevità) permettono l’effettivo accesso al database. 

Gli oggetti DAO non sono istanziati direttamente dai componenti, ma possono essere ottenuti attraverso **metodi factory**.

Una unica **factory astratta** che fornisce specifiche per le **factory concrete** ed espone un metodo creazionale parametrico per ottenere factory concrete. Una factory concreta per ogni tipo di DB supportato permette di ottenere oggetti DAO appropriati al corrispondente tipo di DB e può gestire aspetti quali ottenimento della connessione, autenticazione, ...

### Esempio di DAO
Per ogni classe Entità del modello di dominio creiamo (in un opportuno package) una interfaccia DAOEntità con (le signature dei) metodi che realizzano le operazioni CRUD. Queste interface sono implementate da classi (organizzate in opportuni package). Questa scomposizione permette maggiore flessibilità.

*UML d'esempio*:
![](Pictures/4-02-1.png)

```java
public interface ProdottoDAO {
  public List<Prodotto> doRetrieveAll() throws PersistenceException;
  public Prodotto doRetriveByKey(String codice) throws PersistenceException;
  public void saveOrUpdate(Prodotto prodotto) throws PersistenceException;
  public void delete(Prodotto prodotto) throws PersistenceException;
// eventuali altri doRetriveBy...
}
```

```java
public class ProdottoDAOImpl implements ProdottoDAO {
  public List<Prodotto> doRetrieveAll() throws PersistenceException {
    Connection connection = null;
    List<Prodotto> prodotti;
    ...
    try {
      ...
    } catch (SQLException sqle) {
      throw new PersistenceException(sqle);
    } finally {
      ...
    }
    return prodotti;
  }
...
}
```

Abbiamo classi per il modello, classi per la persistenza, classi di utilità
- **classi del modello** nel package `modello`
- **interfacce DAO** nel package `persistenza`
- **implementazioni (dbms dependant) dei DAO** in package `persistenza.db2`
- classi di utilità nel package `util`

Le classi del modello implementano le entità del modello concettuale, ed è bene che rispettino le seguenti convenzioni:
- tutte le proprietà devono essere private
- per ogni proprietà: metodi setter e getter pubblici
- costruttore no-arg visibile

Una classe che rispetta queste convenzioni viene
chiamata **java bean**.

```java
package modello;
import java.util.*;
import persistenza.*;

public class FacadeImpl implements Facade {
  private ClienteDAO clienteDao;
  ...
  public FacadeImpl() {
    clienteDao = new ClienteDAOImpl();
  }
  public void inserisciClienteNellaAnagrafica(Cliente cliente) throws ClienteException {
    try {
      clienteDao.saveOrUpdate(cliente);
    } catch (PersistenceException e) {
      throw new ClienteException("Exception in ClientiFacade while creating cliente.");
    }
  }
  public List<Cliente> anagraficaClienti(){
    try {
      return clienteDao.doRetrieveClienteAll();
    } catch (PersistenceException e) {
      throw new ClienteException("Exception in ClientiFacade while retrieving cliente.", e);
    }
  }
  public Cliente trovaClientePerCodice(String codiceCliente){
    try {
      return clienteDao.doRetrieveClienteByCodice(codiceCliente);
    } catch (PersistenceException e) {
      throw new ClienteException("Exception in ClientiFacade while retrieving cliente"+ codiceCliente +, e);
    }
  }
  ...
}
```

## Retrive (risoluzione del conflitto di impedenza)
> **Retrieve**: dal DB agli oggetti (ricostruzione degli oggetti a partire da dati persistenti). Il problema principale nel ricostruire oggetti a partire dalla base di dati consiste nel ricostruire i riferimenti. Le forze in gioco sono chiavi esterne contro riferimenti e join (operazione "non direzionale") contro navigazioni.
