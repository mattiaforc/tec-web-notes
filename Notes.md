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
A parte ```<scheme>```, le altre parti possono talora essere
omesse, come nei casi in cui non è inclusa la componente
```<authority>``` o non è inclusa la componente ```<query>```.

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
-   È previsto il passaggio di parametri (la parte \<query\> dell’URL). 
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
I tag HTML sono usati per definire il mark-up di elementi HTML. Sono preceduti e seguiti rispettivamente da due caratteri “<“ e “>”. Sono normalmente accoppiati; un esempio è dato da: \<p\> e \</p\>, detti rispettivamente start tag ed end tag. Il testo tra start tag ed end tag è detto contenuto dell’elemento. Un documento HTML contiene quindi elementi composti da testo semplice delimitato da tag. 

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

È costituita da diverse parti:
-   **HTML** il tipo di linguaggio utilizzato è l'HTML
-   **PUBLIC** il documento è pubblico
- le specifiche non sono registrate all'ISO (altrimenti +)
- **W3C** ente che ha rilasciato le specifiche
- **DTD HTML 4.01 Transitional**: versione di HTML
- **EN** la lingua con cui è scritta il DTD è l'inglese
- **http://...** URL delle specifiche

## Header
È identificato dal tag \<head\>. Contiene elementi non visualizzati dal browser (informazioni di servizio):
-   **\<title\>** titolo della pagina (viene mostrato nella testata della finestra principale del browser)
-   **\<meta\>** metadati informazioni utili ad applicazioni esterne (es. motori di ricerca) o al browser (es. lingua,codifica dei caratteri utile per la visualizzazione di alfabeti non latini)
-   **\<base\>** definisce come vengono gestiti i riferimenti relativi nei link
-   **\<link\>** collegamenti verso file esterni: CSS, script, icone visualizzabili nella barra degli indirizzi del browser
-   **\<script\>** codice eseguibile utilizzato dal documento
-   **\<style\>** informazioni di stile (CSS locali)

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

#### \<meta\> http-equiv
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

#### \<meta\> name
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

## Body
>Il tag <body> delimita il corpo del documento. Contiene la parte che viene mostrata dal browser.

Ammette diversi attributi tra cui:
-   **background** = uri. Definisce l’URI di una immagine da usare come sfondo per la pagina.
-   **text** = color. Definisce il colore del testo
-   **bgcolor** = color. In alternativa a background definisce il colore di sfondo della pagina
-   **lang** = linguaggio definisce il linguaggio utilizzato nella pagina *es. language="it"*.

### Tipi di elementi del body
-   **Intestazioni**: titoli organizzati in gerarchia
-   **Strutture di testo**: paragrafi, testo indentato, ecc.
-   **Aspetto del testo**: grassetto, corsivo, ecc.
-   **Elenchi e liste**: numerati, puntati
-   **Tabelle**
-   **Form** (moduli elettronici): campi di inserimento, checkbox e radio button, menu a tendina, bottoni, ecc.
-   **Collegamenti ipertestuali** e ancore
-   **Immagini e contenuti multimediali** (audio, video, animazioni, ecc.)
-   **Contenuti interattivi**: script, applicazioni esterne.

### Elementi blocco, elementi inline e liste
Dal punto di vista del layout della pagina gli elementi HTML si dividono in 3 grandi categorie: 
1.  **Elementi “block-level”**: costituiscono un blocco attorno a sé, e di conseguenza «vanno a capo» (paragrafi, tabelle, form...)
2.  **Elementi “inline”**: non vanno a capo e possono essere integrati nel testo (link, immagini,...)
3.  **Liste**: numerate, puntate 
  
>**Regole di composizione**: Un elemento block-level può contenere altri elementi dello stesso tipo o di tipo inline. Un elemento inline può contenere solo altri elementi inline.

### Elementi rimpiazzati e non rimpiazzati
>Gli elementi rimpiazzati sono quelli di cui il browser conosce le dimensioni intrinseche. Sono quelli in cui altezza e larghezza sono definite dall'elemento stesso e non da ciò che lo circonda. L'esempio più tipico di elemento rimpiazzato è \<img\> o \<input\>.

Tutti gli altri elementi sono in genere considerati non rimpiazzati.

### Heading e paragrafi
>La "h" sta per **"heading"**, cioè titolo e sono previste 6 grandezze; I tag \<h1\>,\<h2\> ... \<h6\> servono per definire dei titoli di importanza decrescente (\<h1\> è il più importante). 

>Il **paragrafo** è l'unità di base entro cui suddividere un testo: è un elemento di tipo blocco. Il tag \<p\> lascia una riga vuota prima della sua
apertura e dopo la sua chiusura. È possibile definire l’allineamento di un paragrafo mediante l’attributo align. (*left, center, right, justify*).

>Se al posto di \<p\> si usa il **tag \<div\>** il blocco di testo va a capo, ma - a differenza del paragrafo - non lascia spazi prima e dopo la sua apertura. È l'elemento di tipo blocco per eccellenza.

>Lo **\<span\>** è un contenitore generico che può essere annidato (ad esempio) all'interno dei **\<div\>**. È un elemento inline, e quindi non va a capo ma continua sulla stessa linea del tag che lo include.

>Il **tag \<hr\>** serve ad inserire una riga di separazione. Esempio: ```<hr noshade size="5" width="50%" align="center">```

### Gli stili del Testo
Nella terminologia tipografica lo "stile di un testo" indica le possibili varianti di forma di un carattere: tondo (normale), neretto (grassetto), corsivo. HTML consente di definire lo stile di un frammento di testo, combinando fra loro anche più stili. I tag che svolgono questa funziona vengono normalmente suddivisi in fisici e logici:
-   >**Tag fisici**: definiscono lo stile del carattere in termini grafici indipendentemente dalla funzione del testo nel documento. Ad esempio: \<i\>...\</i\> = Corsivo; \<b\>...\</b\> = Grassetto...
-   >**Tag logici**: forniscono informazioni sul ruolo svolto dal contenuto, e in base a questo adottano uno stile grafico. Ad esempio: \<code>/\<pre> Codice: usualmente monospace; \<blockquote> Blocco di citazione.

>Il **tag \<font\>** permette di formattare il testo, definendo dimensioni, colore, tipo di carattere.

### Liste ordinate e non ordinate
>Il tag \<ul\> (**unordered list**) permette di definire liste non ordinate (puntate). Gli elementi della lista vengono definiti mediante il tag \<li\> (**list item**).

>Il tag \<ol\> (**ordered list**) permette di definire liste ordinate (numerati). Gli elementi vengono definiti mediante il tag \<li\>.

>Il tag \<dl\> (**definition list**) permette di definire liste di definizione. Sono liste costituite alternativamente da termini (tag \<dt\>) e definizioni (tag \<dd\>).

### Tabelle
Il tag \<table\> racchiude la tabella. **Attributi**:
-   ```align = “{left|center|right}”``` allineamento della tabella rispetto alla pagina;
-   ```width=“n|n%”``` larghezza della tabella (anche in percentuale rispetto alla pagina);
-   ```bgcolor=“#xxxxxx”``` colore di sfondo della tabella;
-   ```border=“n”``` spessore dei bordi della tabella (0 = tabella senza bordi);
-   ```cellspacing, cellpadding```

#### Righe
**\<tr\>** è il tag che racchiude ciascuna riga della tabella. Attributi: align = ```“{left|center|right|justify}”```. 
valign = ```“{top|middle|bottom|baseline}”```.
bgcolor=```“#xxxxxx”```.

#### Testate e Celle
\<th\> e \<td\> sono i tag che racchiudono le celle (stessi attributi di tr):
-   **\<th\>** serve per le celle della testata.
-   **\<td\>** serve per le celle del contenuto.

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
Il tag ```<img>``` consente di inserire immagini in un documento HTML.  

**Attributi**:  
- ```src = uri``` specifica l’indirizzo dell’immagine (required)
- ```alt = text``` testo alternativo nel caso fosse impossibile visualizzare l’immagine
- ```align = {bottom|middle|top|left|right}``` (deprecato in HTML 4.01) posizione dell’immagine rispetto al testo che la circonda
- ```width,height = pixels``` larghezza e altezza dell’immagine in pixel
- ```border = pixels``` (deprecato in HTML 4.01) spessore del bordo dell’immagine

### Form
Un form (modulo) è una sezione di documento HTML che contiene elementi di controllo che l’utente può utilizzare per inserire dati o in generale per interagire
Il tag ```<form>``` racchiude tutti gli elementi del modulo (è un elemento di tipo blocco)

**Attributi**:
- ```action = uri ``` URI dell’agente che riceverà i dati del form
- ```name = text``` specifica il nome del form
- ```method = {get|post}``` specifica il modo in cui i dati vengono inviati
- ```enctype = content-type``` se il metodo è POST specifica il content type usato per la codifica (encoding) dei dati contenuti nel form

La maggior parte dei controlli viene definita mediante il tag ```<input>```

#### Input text
È un campo per l’inserimento di testo su una sola riga

**Attributi**:
- ```name = text``` nome del controllo
- ```value = text``` eventuale valore iniziale
- ```size = n``` lunghezza del campo (numero di caratteri)
- ```maxlength = n``` massima lunghezza del testo (numero di caratteri)

#### Input file
Consente di fare l’upload di un file selezionandolo nel filesystem del client

**Attributi**:
- ```name = text``` specifica il nome del controllo
- ```value = content-type``` lista di MIME types per l’upload

